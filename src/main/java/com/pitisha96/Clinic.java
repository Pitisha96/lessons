package com.pitisha96;

import com.pitisha96.animals.Pet;
import com.pitisha96.clients.Client;
import java.util.*;

/**
 * Клиника
 * @author Илья Петровский
 * @since 20.12.2020
 */
public class Clinic implements IClinic{
    /**
     * Счетчик ид клиента
     */
    private static int countId=0;
    private Map<Integer, Client> clients=new LinkedHashMap<>();

    /**
     * Возвращает список клиентов
     * @return список клиентов
     */
    public Map<Integer, Client> getClients() {
        return clients;
    }

    /**
     * {@inheritDoc}
     * @param client Клиент
     */
    @Override
    public void addClient(final Client client){
        if(clients!=null){
            clients.put(++countId,client);
        }else{
            clients=new LinkedHashMap<>();
            clients.put(++countId,client);
        }
    }

    /**
     * {@inheritDoc}
     * @param name Имя хозяина
     * @param pet Новый питомец
     */
    @Override
    public void addPet(String name, Pet pet){
        for(Client simple_client:clients.values()){
            if(simple_client.getName().equals(name)){
                simple_client.setPets(pet);
            }
        }
    }

    /**
     * {@inheritDoc}
     * @param name Старое имя клиента
     * @param otherName Новое имя клиента
     */
    @Override
    public void updateClient(String name,String otherName){
        for(Client simple_client:clients.values()){
            if(simple_client.getName().equals(name)){
                simple_client.setName(otherName);
            }
        }
    }

    /**
     * {@inheritDoc}
     * @param nameClient Имя клиента
     * @param namePet Старая кличка питомца
     * @param otherNamePet Новое имя питомца
     */
    @Override
    public void updatePet(String nameClient,String namePet,String otherNamePet){
        for(Client simple_client:clients.values()){
            if(simple_client.getName().equals(nameClient)){
                simple_client.getPets().forEach(p->{
                    if(p.getName().equals(namePet)){
                        p.setName(otherNamePet);
                    }
                });
            }
        }
    }

    /**
     * {@inheritDoc}
     * @param name Имя клиента
     */
    @Override
    public void deleteClient(String name) {
        for(Map.Entry<Integer,Client> simple_KVclient:clients.entrySet()){
            if(simple_KVclient.getValue().getName().equals(name)){
                clients.remove(simple_KVclient.getKey(), simple_KVclient.getValue());
            }
        }
    }

    /**
     * {@inheritDoc}
     * @param name Имя клиента
     * @param namePet Имя питомца
     */
    @Override
    public void deletePet(String name,String namePet){
        for(Client simple_client:clients.values()){
            if(simple_client.getName().equals(name)){
                simple_client.deletePet(namePet);
            }
        }
    }

    /**
     * {@inheritDoc}
     * @param name Имя клиента
     * @return Список совпадений
     */
    @Override
    public List<Client> searchClient(String name){
        List<Client> result=new LinkedList<>();
        for(Client simple_client:clients.values()){
            if(simple_client.getName().contains(name)){
                result.add(simple_client);
            }
        }
        return result;
    }

    /**
     * {@inheritDoc}
     * @param namePet Имя питомца
     * @return Список клиентов с такими питомцами
     */
    @Override
    public List<Client> searchPet(String namePet){
        List<Client> result = new LinkedList<>();
        for(Client simple_client:clients.values()){
            List<Pet> pets= new LinkedList<>(simple_client.getPets());
            for(Pet pet: pets){
                if(pet.getName().contains(namePet)){
                    result.add(simple_client);
                }
            }
        }
        return result;
    }
}
