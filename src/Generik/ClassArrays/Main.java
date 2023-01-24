package Generik.ClassArrays;

import Generik.ClassArrays.ClassArrays;

public class Main {
    // Создадим в методе main несколько объектов нашего типа
    public static void main(String[] args) {
        ClassArrays<Byte> byteArray = new ClassArrays<>(new Byte[4]);
        ClassArrays<Double> doubleArray = new ClassArrays<>(new Double[3]);
        ClassArrays<Integer> integerArray = new ClassArrays<>(new Integer[9]);

        // Благодаря тому, что мы использовали универсальный тип данных — Т,
        // мы можем передать в конструктор нашего объекта массив, который
        // может содержать объекты любого типа, что существенно сокращает
        // количество написанного нами кода

    }
}
