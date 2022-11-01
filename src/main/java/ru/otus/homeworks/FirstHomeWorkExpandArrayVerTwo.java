package ru.otus.homeworks;


import java.util.Arrays;

public class FirstHomeWorkExpandArrayVerTwo {
    private int [] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    // constructor for the default capacity
    public FirstHomeWorkExpandArrayVerTwo() {
        this.elements = new int[DEFAULT_CAPACITY];
    }

    // create array if initial capacity appear
    public FirstHomeWorkExpandArrayVerTwo(int initialCapacuty) {
        if (initialCapacuty >= 0) {
            this.elements = new int[initialCapacuty];
        }
        else {
            throw new IllegalStateException("Capacity can't be less then 0");
        }
    }

    //get element with index
    public int get(int index) {
        isIndexExist(index); //check is index correct
        return elements[index];
    }

    //return amount of elements
    public int size () {
        return size;
    }

    //add element to the end of the list
    public boolean add(int value) {
        if (size == elements.length) {
            elements = increaseCapacity();
        }
        elements[size] = value;
        size++;
        return true;
    }

    // increase array length
    private int[] increaseCapacity() {
        int[] temp = new int[(elements.length * 2)];
        System.arraycopy(elements, 0, temp, 0, elements.length);
        return temp;
    }

    // set element on the position
    public int set(int value, int index){
        isIndexExist(index);
        int temp = elements[index];
        elements[index] = value;
        return temp;
    }

    //переопределил метод для красивого вывода списка на экран, иначе будут выводиться значения незаполненных ячеек [1, 10] вместо [1, 10, 0, 0...]
    @Override
    public String toString(){
        int [] temp = new int[size];
        System.arraycopy(elements, 0, temp, 0, size);
        return Arrays.toString(temp);
    }

    //проверяем индексы, не выходят ли они за границы массива
    private int isIndexExist(int index){
        if (index >= size || index < 0){
            throw new IndexOutOfBoundsException("Element can't be found! "
                    + "Number of elements in array = " + size
                    + ". Total size of array = " + elements.length);
        }
        return index;
    }

    //проверяем, есть ли элементы в списке
    public boolean isEmpty(){
        return (size == 0);
    }

    //удаляем элемент по индексу
    public int remove (int index){
        isIndexExist(index);  //проверяем индекс
        int [] temp = elements;  //во временный массив заносим ссылку на текущий массив
        elements = new int [temp.length-1];  //полю elements присваиваем ссылку на новый массив размером меньше на 1
        int value = temp[index];  //сохраняем в доп. переменную значение удаляемого элемента
        System.arraycopy(temp, 0, elements, 0, index);  //копируем левую часть массива до указанного индекса
        System.arraycopy(temp, index + 1, elements, index, temp.length - index - 1);  //копируем правую часть массива после указанного индекса
        size--;  //уменьшаем значение переменной
        return value;
    }

}
