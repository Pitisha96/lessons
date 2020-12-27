package com.pitisha96;

import com.pitisha96.animals.Pet;
import com.pitisha96.clients.Client;

import java.util.List;
/**
 * Интерфейс клиники
 * @author Илья Петровский
 * @since 20.12.2020
 */
public interface IClinic {
    /**
     * Добавление клиента
     * @param client Клиент
     */
    void addClient(Client client);

    /**
     * Добавление питомца
     * @param name Имя хозяина
     * @param pet Новый питомец
     */
    void addPet(String name, Pet pet);

    /**
     * Обновление клиента
     * @param name Старое имя клиента
     * @param otherName Новое имя клиента
     */
    void updateClient(String name,String otherName);

    /**
     * Обновление питомца
     * @param nameClient Имя клиента
     * @param namePet Старая кличка питомца
     * @param otherNamePet Новое имя питомца
     */
    void updatePet(String nameClient,String namePet,String otherNamePet);

    /**
     * Удаление клиента
     * @param name Имя клиента
     */
    void deleteClient(String name);

    /**
     * Удаление питомца
     * @param name Имя клиента
     * @param namePet Имя питомца
     */
    void deletePet(String name,String namePet);

    /**
     * Поиск клиента по имени
     * @param name Имя клиента
     * @return Список найденных клиентов
     */
    List<Client> searchClient(String name);

    /**
     * Поиск питомца по имени
     * @param namePet Имя питомца
     * @return Список клиентов с такими питомцами
     */
    List<Client> searchPet(String namePet);
}
