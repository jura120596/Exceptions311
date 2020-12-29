package com.example.exceptions311;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException {
        try { //попробовать ввыполнить код ниже
            new Fraction(0,0); //выкинет исключение со знаменателем
            Scanner sc = new Scanner(new File("inn.txt")); // тут с файлом
        } catch (FileNotFoundException|ZeroDenumException e) {
            // e.printStackTrace(); //вывод информации о маршруте к ошибке
            System.out.println("Создай файл и перезапусти программу");
            System.out.println("Или у тебя нулевой знаменатель, а я буду работать дальше");
        }
        if (Math.random() > 0) {
            try {
                int[] a = {1};
                int b = a[1]; //выйдет исключени с индесами массива
                throw new MyException(); //мб код, который выкинет это исключение
            } catch (MyException e) {
                System.out.println("произошло мое исключение в catch");
            } finally {
                System.out.println("Я всегда работаю в finally");
            }

        }
        try {
            //какой то код с ошибками и сключениями
        } catch (Throwable e) {
            MyError e2= new MyError();
            throw e2;
        }
        System.out.println("Программа еще работает");
    }
}
