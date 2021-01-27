package com.pitisha96.collections;

import java.util.Iterator;

public class LinkArray<T> implements Iterable<T>{
    Element<T> first;
    Element<T> last;
    private int size=0;
    static class Element<T>{
        Element<T> previous;
        Element<T> next;
        T value;
        public Element(){
            this.previous=null;
            this.next=null;
            this.value=null;
        }
    }

    /**
     * Добавляет указанный элемент в список
     * @param o добавляемый элемент
     */
    public void add(T o){
        ++size;
        if(this.first==null){
            this.first= new Element<>();
            this.first.value=o;
        }else if(this.last==null){
            this.last= new Element<>();
            this.last.previous=first;
            this.last.value=o;
            this.first.next=this.last;
        }else{
            Element<T> next= new Element<>();
            next.value=o;
            next.previous=this.last;
            this.last.next=next;
            this.last=next;
        }
    }

    /**
     * Возвращает элемент из списка с указанным номером
     * @param index номер элемента в списке
     * @return элемент из списка
     */
    public T get(int index){
        Element<T> e=first;
        for(int i=0;i<index;i++){
            e=e.next;
        }
        return e.value;
    }

    /**
     * Удаляет указанный элемент из списка
     * @param index номер элемента в списке
     */
    public void remove(int index){
        Element<T> e=this.first;
        for(int i=0;i<index;i++){
            e=e.next;
        }
        e.next.previous=e.previous;
        e.previous.next=e.next;
        this.size--;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private int pos=0;
            Element<T> e =first;
            @Override
            public boolean hasNext() {
                return pos<size;
            }

            @Override
            public T next() {
                Element<T> result=e;
                e=e.next;
                pos++;
                return result.value;
            }
        };
    }
}
