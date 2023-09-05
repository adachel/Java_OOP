package Seminars.Seminar3.Ex003;
/**
 * Дз:
 * Дописать игру быки-коровы
 * - на русском и английском алфавите
 * - сделать логирование действий и по запросу пользователя посмотреть всю историю игры
 * - * реализовать перезапуск игры
 */


import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IOException {
        Path logFile = Path.of("D:\\Works\\IT\\Java_start\\GeekBrains\\OOP\\src\\main\\java" +
                                    "\\Seminars\\Seminar3\\Ex003\\logFile.txt");
        if (Files.notExists(logFile)) Files.createFile(logFile);

        try (BufferedWriter bf = Files.newBufferedWriter(Path.of(String.valueOf(logFile)),
                StandardOpenOption.TRUNCATE_EXISTING)) {
        } catch (IOException e) {
            e.printStackTrace();
        }

        LocalDateTime now = LocalDateTime.now();
        String timeNow = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

//        int chose = 0;

        while (true) {

            System.out.println("Выберете категорию");
            System.out.println( "1 - цифровые символы, 2 - русские буквы, 3 - английский буквы, " +
                                "4 - посмотреть логи, 5 - выход из игры");
            Scanner tempType = new Scanner(System.in);
            int typeData = Integer.parseInt(tempType.nextLine());

            Game game = null;

            if (typeData == 1) {
                game = new GameNumber();
                Files.writeString(logFile, timeNow + " " + "Выбрали вариант '1' - цифровые символы: " +
                                                                            "\n", StandardOpenOption.APPEND);
            } else if (typeData == 2) {
                game = new RuGame();
                Files.writeString(logFile, timeNow + " " + "Выбрали вариант '2' - русские буквы: " +
                                                                            "\n", StandardOpenOption.APPEND);
            } else if (typeData == 3) {
                game = new EnGame();
                Files.writeString(logFile, timeNow + " " + "Выбрали вариант '3' - английские буквы: " +
                                                                            "\n", StandardOpenOption.APPEND);
            } else if (typeData == 4) {
                System.out.println("Посмотреть логи");
                String logs = Files.readString(logFile);
                System.out.println(logs);
                continue;
            } else if (typeData == 5) {
                Files.writeString(logFile, timeNow + " " + "Выход из игры" + "\n",
                                                                StandardOpenOption.APPEND);
                System.out.println("Выход из игры");
                break;
            } else {
                System.out.println("Введите корректные данные");
                Files.writeString(logFile, timeNow + " " + "Не корректный выбор" + "\n",
                                                                StandardOpenOption.APPEND);
                continue;
            }

            System.out.println("Выберете длину слова");
            Scanner tempSize = new Scanner(System.in);
            int sizeWord = Integer.parseInt(tempSize.nextLine());
            Files.writeString(logFile, timeNow + " " + "Зaдaли длину словa: " + "'" + sizeWord + "'" +
                                                            "\n", StandardOpenOption.APPEND);

            System.out.println("Выберете количество попыток");
            Scanner tempTry = new Scanner(System.in);
            int maxTry = Integer.parseInt(tempTry.nextLine());
            Files.writeString(logFile, timeNow + " " + "Зaдaли количество попыток: "+ "'" + maxTry + "'" +
                                                            "\n", StandardOpenOption.APPEND);

            game.start(sizeWord, maxTry);

            String wordComp = AbstractGame.getWord();
            Files.writeString(logFile, timeNow + " " + "Компьютер загадал слово: " + "'" +
                                            wordComp + "'" + "\n", StandardOpenOption.APPEND);

            Scanner scanner = new Scanner(System.in);

            while (!game.getGameStatus().equals(GameStatus.winner)
                    && !game.getGameStatus().equals(GameStatus.lose)) {
                System.out.println("Введите свой вариант слова");
                String scannerWord = scanner.nextLine();
                Files.writeString(logFile, timeNow + " " + "Ввели свой вaриaнт словa: " + "'" +
                                                scannerWord + "'" + "\n", StandardOpenOption.APPEND);
                Answer answer = game.inputValue(scannerWord);
                Files.writeString(logFile, timeNow + " " + "Результат попытки: " + "'" +
                                                answer + "'" + "\n", StandardOpenOption.APPEND);
                System.out.println("Результат попытки: " + answer);
            }
            System.out.println("Результат игры: " + game.getGameStatus());
            Files.writeString(logFile, timeNow + " " + "Результат игры: " + "'" +
                                            game.getGameStatus() + "'" + "\n", StandardOpenOption.APPEND);
        }
    }
}
