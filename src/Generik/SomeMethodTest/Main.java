package Generik.SomeMethodTest;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1, 7, 2, 14, 9};

        if (SomeMethodTest.isContain(2, intArray)) {
            System.out.println("2 входит в массив intArray");
        }

        if (!SomeMethodTest.isContain(8, intArray)) {
            System.out.println("8 не входит в intArray");
        }
        System.out.println();

        String[] strArray = {"one", "four", "five"};

        if (SomeMethodTest.isContain("five", strArray)) {
            System.out.println("five входит в массив strArray");
        }

        if (!SomeMethodTest.isContain("ten", strArray)) {
            System.out.println("ten не входит в массив strArray");
        }
    }
}

