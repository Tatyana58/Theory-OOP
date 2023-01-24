package Generik.SomeConstructorClassEx;

public class SomeConstructorClassEx {
    private double value;

    public <T extends Number> SomeConstructorClassEx(T arg) {
        value = arg.doubleValue();
    }

    public void printValue() {
        System.out.println("value: " + value);
    }
}

