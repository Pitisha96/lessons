package com.pitisha96.collections;

import java.util.Arrays;
import java.util.Iterator;

public class DynamicArray<T> implements Iterable<T>{
    private int size=0;
    private Object[] array;

    /**
     * Создает список имеющий вместимость указаного размера
     * @param capacity размер который указывает на вместимость создаваемого элемента
     */
    DynamicArray(int capacity){
        this.array=new Object[capacity];
    }

    /**
     * Добавляет указаный элемент в список. Если вместимости не хватает, то емкость увеличивается в 2 раза.
     * @param o элемент,который должен быть добавлен в список
     */
    public void add(T o){
        size++;
        if(size>this.array.length){
            array= Arrays.copyOf(array,size*2);
        }
        this.array[size-1]=o;
    }

    /**
     * Возвращает элемент из списка с указанным индексом
     * @param index номер элемента в списке
     * @return элемент из списка с указанным номером
     */
    public T get(int index){
        return (T)this.array[index];
    }

    /**
     * Удаляет элемент с указанным номером
     * @param index номер элемента в списке
     */
    public void remove(int index){
        for(int i=index+1;i<size;i++){
            this.array[i-1]=this.array[i];
        }
        size--;
    }

    /**
     * {@inheritDoc}
     * @return
     */
    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            int pos=0;
            @Override
            public boolean hasNext() {
                return pos<size;
            }

            @Override
            public T next() {
                return (T)array[pos++];
            }
        };
    }
}
