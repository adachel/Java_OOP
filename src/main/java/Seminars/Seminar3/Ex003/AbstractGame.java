package Seminars.Seminar3.Ex003;

import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game {

    Integer sizeWord;
    Integer maxTry;
    static String word;
    GameStatus gameStatus = GameStatus.init;

    public static String getWord() {
        return word;
    }

    /**
     * @apiNote метод предзаполняет слово компьютера
     * @return слово для угадывания
     */
    public String generateWord(){  // генератор слова
        List<String> alphabet = generateCharList();
        Random r = new Random();
        String result = "";
        for (int i = 0; i < sizeWord; i++){
            int index = r.nextInt(alphabet.size());
            result = result.concat(alphabet.get(index));
            alphabet.remove(index);
        }
        return result;
    }

    abstract List<String> generateCharList(); // набор символов

    @Override
    public void start(Integer sizeWord, Integer maxTry) {
        this.sizeWord = sizeWord;
        this.maxTry = maxTry;
        this.word = generateWord();
        gameStatus = GameStatus.start;
        System.out.println("подсказка " + word);
    }

    @Override
    public Answer inputValue(String value) {
        maxTry--;
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == value.charAt(i)){
                bulls++;
                cows++;
            }else {
                for (int j = 0; j < word.length(); j++){
                    if (word.charAt(j) == value.charAt(i)) {
                        cows++;
                    }
                }
            }
        }
        if (word.length() == bulls){
            gameStatus = GameStatus.winner;
        }
        if (maxTry == 0 && !gameStatus.equals(GameStatus.winner)){
            gameStatus = GameStatus.lose;
        }
        return new Answer(value, bulls, cows);
    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }
}
