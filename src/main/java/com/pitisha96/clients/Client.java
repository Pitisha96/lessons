package com.pitisha96.clients;

import com.pitisha96.animals.Pet;

import java.util.*;

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
    private Set<Pet> pets;

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
            pets=new TreeSet<>();
            pets.add(pet);
        }
    }

    /**
     * Получить список питомцев
     * @return возвращает список питомцев
     */
    public Set<Pet> getPets() {
        if(pets!=null){
            return pets;
        }
        return Collections.emptySet();
    }

    /**
     * Удаление питомца
     * @param namePet имя питомца
     */
    public void deletePet(String namePet){
        pets.removeIf(pet -> pet.getName().equals(namePet));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name) &&
                Objects.equals(pets, client.pets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pets);
    }
}
