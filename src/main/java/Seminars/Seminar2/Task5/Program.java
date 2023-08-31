package Seminars.Seminar2.Task5;
/**
 *  Создать классы Собака, Кот, Домашний Кот, Тигр, Животное
 *  Животные могут бежать и плыть. В качестве аргумента каждому методу передается длина препятствия.
 *  У каждого животного есть ограничения на действия (бег: кот — 200 м, собака — 500 м; плавание:
 *   кот — не умеет плавать, собака — 10 м). Результатом выполнения действия будет печать в консоль.
 *  Например: dogBobik.run(150); -> 'Бобик пробежал 150 м'.
 *  Создать один массив с животными и заставить их по очереди пробежать дистанцию и проплыть.
 *  Добавить подсчет созданных Домашних Котов, Тигров, Собак, Животных.
 */

import Seminars.Seminar2.Animal;
import Seminars.Seminar2.Cat;
import Seminars.Seminar2.Dog;

public class Program {
    public static void main(String[] args) {
        Animals[] animals = {
                new DogTask("Dog"),
                new HomeCat("HomeCat"),
                new Tiger("Tiger")
        };
        for (Animals animals1: animals){
            animals1.run(300);
            animals1.swim(5);
        }
    }
}
