package Generik.Average;

public class Main {
    public static void main(String[] args) {

        Integer intArray[] = {1, 5, 2, 4, 3};
        Double doubleArray[] = {2.4, 7.3, 4.4, 15.1};

        Average<Integer> aveInt = new Average<>(intArray);
        Average<Double> aveDouble = new Average<>(doubleArray);

        if (aveInt.sameAvg(aveDouble)) {
            System.out.println("являются одинаковыми");}
        else {
            System.out.println("отличаются");
        }
    }
}
