package Generik.SomeClass;
//Параметризованные интерфейсы
//Интерфейсы также могут быть параметризованными. Логика реализации дженериков в интерфейсах не отличается от их реализации в классах.
public class SomeClass<T> implements SomeInterface<T> {
    @Override
    public T someMethod(T t) {
        return t;
    }
    public static void main(String[] args) {
        SomeInterface<String> obj = new SomeClass<>();
        String string = obj.someMethod("some string");
        System.out.println(string);
    }
}
