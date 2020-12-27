package com.pitisha96.actions;

import com.pitisha96.IClinic;
import com.pitisha96.Validator;
import com.pitisha96.clients.Client;

import java.util.List;

public class SearchPetAction implements Action {

    /**
     * {@inheritDoc}
     * @param clinic  Клиника
     * @param validator Валидатор ввода
     */
    @Override
    public void execute(IClinic clinic, Validator validator) {
        List<Client> pets=clinic.searchPet(validator.getString("Имя питомца: "));
        System.out.println("\nРезультат поиска: ");
        pets.forEach(c-> System.out.println(c.getName()));
    }

    /**
     * {@inheritDoc}
     * @return пункт меню
     */
    @Override
    public String intro() {
        return String.format("%s-найти питомца",this.key());
    }

    /**
     * {@inheritDoc}
     * @return номер операции
     */
    @Override
    public int key() {
        return 8;
    }
}
