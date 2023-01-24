package Generik.SomeSuperClass;
//Иерархии параметризованных классов
//Так же как и непараметризованные классы, классы, объявленные с параметром типа, могут строить иерархию.
// Разница в том, что параметр должен передаваться по всем поколениям классов.
public class SomeSuperClass<T> {
    private T obj;

    public SomeSuperClass(T obj) {
        this.obj = obj;
    }

    private T getObj() {
        return obj;
    }
}

