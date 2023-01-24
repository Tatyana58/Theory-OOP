package Generik.SomeConstructorClassEx;

public class SomeConstructorClassExTest {
    public static void main(String[] args) {
        SomeConstructorClassEx constr1 = new SomeConstructorClassEx(100);
        SomeConstructorClassEx constr2 = new SomeConstructorClassEx(123.5F);

        constr1.printValue();
        constr2.printValue();
    }
}
