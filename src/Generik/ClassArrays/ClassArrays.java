package Generik.ClassArrays;
// Параметризуем наш класс типом Т
public class ClassArrays<T> {
    // Объявим в классе поле — массив типа Т
    private T[] array;

    // Создадим конструктор на основе нашего массива
    public ClassArrays(T[] array) {
        this.array = array;
    }
}
