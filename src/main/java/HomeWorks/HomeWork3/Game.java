package HomeWorks.HomeWork3;

/**
 * a)Интерфейс взаимодействий Game (должны быть описаны сигнатуры методов start, inputValue, getGameStatus)
 */
public interface Game {
    /**
     * @apiNote метод старта игры
     * @param sizeWord ограничение длины слова
     * @param maxTry макс кол-во попыток
     */
    void start(Integer sizeWord, Integer maxTry);

    /**
     * @apiNote метод ввода и сравнения вариантов слов игрока 1(компьютера) с игроком 2
     * @param value вариант слова игрока 2(задается в консоли)
     * @return результат сравнения
     */
    Answer inputValue(String value);

    /**
     * @apiNote метод для использования статуса игрока 2
     * @return текущий статус игрока 2
     */
    GameStatus getGameStatus();



}
