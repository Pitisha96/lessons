package com.pitisha96.actions;

import com.pitisha96.IClinic;
import com.pitisha96.validators.Validator;

public class deleteClientAction implements Action {
    /**
     * {@inheritDoc}
     * @param clinic  Клиника
     * @param validator Валидатор ввода
     */
    @Override
    public void execute(IClinic clinic, Validator validator) {
        clinic.deleteClient(validator.getString("Имя клиента: "));
    }

    /**
     * {@inheritDoc}
     * @return пункт меню
     */
    @Override
    public String intro() {
        return String.format("%s-удалить клиента",this.key());
    }

    @Override
    public int key() {
        return 5;
    }
}
