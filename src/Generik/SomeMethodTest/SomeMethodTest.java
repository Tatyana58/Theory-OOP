package Generik.SomeMethodTest;

public class SomeMethodTest {
    public static <T,V> boolean isContain(T obj, V[] array) {
        for (V value : array) {
            if (obj.equals(value)) {
                return true;
            }
        }
        return false;
    }
}
