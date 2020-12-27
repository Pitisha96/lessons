package com.pitisha96.clients;

import com.pitisha96.animals.Pet;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Клиент
 * @author Илья Петровский
 * @since 20.12.2020
 */
public class Client {
    /**
     * Имя клиента
     */
    private String name;

    /**
     * Список животных
     */
    private List<Pet> pets;

    /**
     * Конструктор клиента
     * @param name Имя нового клиента
     */
    public Client(String name){
        this.name=name;
    }

    /**
     * Задать имя клиента
     * @param name Новое имя клиента
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Получить имя клиента
     * @return Имя клиента
     */
    public String getName() {
        return name;
    }

    /**
     * Добавить питомца
     * @param pet Новый питомец
     */
    public void setPets(final Pet pet){
        if(pets != null){
            pets.add(pet);
        }else{
            pets=new LinkedList<>();
            pets.add(pet);
        }
    }

    /**
     * Получить список питомцев
     * @return возвращает список питомцев
     */
    public List<Pet> getPets() {
        if(pets!=null){
            return pets;
        }
        return Collections.emptyList();
    }

    /**
     * Удаление питомца
     * @param namePet имя питомца
     */
    public void deletePet(String namePet){
        pets.removeIf(pet -> pet.getName().equals(namePet));
    }
}
