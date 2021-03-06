package com.pitisha96.animals;

/**
 * Интерфейс питомца
 * @author Илья Петровский
 * @since 20.12.2020
 */
public interface Pet extends Comparable<Pet>{
    /**
     * Задает новое имя питомцу
     * @param name Новое имя питомца
     */
    void setName(String name);

    /**
     * Возвращает имя питомца
     * @return Имя питомца
     */
    String getName();

    @Override
    default int compareTo(Pet o) {
        return getName().compareTo(o.getName());
    }
}
