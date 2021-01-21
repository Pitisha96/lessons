package com.pitisha96;

import java.io.Closeable;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;

/**
 * Валидатор
 * @author Илья Петровский
 * @since 23.12.2020
 */
public class Validator implements Closeable{
    private final Scanner scanner;

    /**
     * Конструктор класса валидатор
     * @param scanner сканнер из потока ввода
     */
    public Validator(Scanner scanner){
        this.scanner=scanner;
    }

    /**
     * Читаем текстовое сообщение из консоли
     * @param message сообщение для показа пользователю
     * @return введенное пользователем сообщение
     * @throws IllegalArgumentException если ввели пустое сообщение
     */
    public String getString(String message)
            throws IllegalArgumentException{
        String result;
        System.out.print(message);
        try{
            result=this.scanner.next();
        }catch (NoSuchElementException ex){
            throw new IllegalArgumentException("Вы ничего не ввели");
        }
        return result;
    }

    /**
     * Читаем целочисленное значение от пользователя
     * @param message сообщение для пользователя
     * @return число из консоли
     * @throws IllegalArgumentException если введены не верные данные
     */
    public int getInt(String message)
            throws IllegalArgumentException{
        int result;
        System.out.print(message);
        try{
            result=this.scanner.nextInt();
            scanner.next();
        }catch (InputMismatchException ex){
            throw new IllegalArgumentException("Вы ввели не верное значение");
        }
        return result;
    }

    /**
     * Получаем номер операции от пользователя
     * @param message сообщение для пользователя
     * @param set список номеров операций
     * @return номер операции
     * @throws UnsupportedOperationException если такого номера операции нет в списке
     * @throws IllegalArgumentException если введено не число
     */
    public int getIntFromList(String message, Set<? super Integer> set)
            throws UnsupportedOperationException,IllegalArgumentException{
        int result;
        System.out.print(message);
        try{
            result = this.scanner.nextInt();
            if(!set.contains(result)){
                throw new UnsupportedOperationException("такая операция не поддерживается");
            }
        }catch (InputMismatchException ex){
            throw new IllegalArgumentException("Вы ввели не верное значение");
        }
        return result;
    }


    /**
     * {@inheritDoc}
     */
    //@Override
    public void close(){
        this.scanner.close();
    }
}
