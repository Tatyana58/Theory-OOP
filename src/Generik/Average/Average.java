package Generik.Average;

// Создадим класс Average,
// который типизируем классом Number и его наследниками
public class Average<T extends Number> {

    // Создадим поле в виде массива
    private T[] array;

    // Сформируем конструктор на основе поля
    public Average(T[] array) {
        this.array = array;
    }

    // Создадим и реализуем метод average, который подсчитывает
    // среднее арифметическое среди всех членов массива
    public double average() {
        double sum = 0.0;

        for (T value : array) {
            sum += value.doubleValue();
        }

        return sum / array.length;
    }
//  boolean sameAvg(Average<T> object) {    //Но такой код работать не будет.
//      return average() == object.average();
//  }
//Такая запись подразумевает использование массивов с идентичными параметрами типов.
// А в нашем случае типы разнятся. Для того чтобы данный метод корректно работал в наших условиях,
// необходимо использовать wildcard <?>.

    boolean sameAvg(Average<?> object) {
        return average() == object.average();
    }
}
