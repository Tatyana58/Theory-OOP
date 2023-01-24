package Interfase.SomeClass;

public class SomeClass implements SomeInterface{
    public void printConst(int value) {
        if(value == const1) {
            System.out.println(const1);
        } else if(value == const2) {
            System.out.println(const2);
        } else {
            System.out.println("Ничего");
        }
    }
}
