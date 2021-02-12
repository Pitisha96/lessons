package com.pitisha96.actions;

import com.pitisha96.IClinic;
import com.pitisha96.validators.Validator;

/**
 * Переименование клиента
 * @author Илья Петровский
 * @since 24.12.2020
 */
public class UpdateClientAction implements Action {
    /**
     * {@inheritDoc}
     * @param clinic  Клиника
     * @param validator Валидатор ввода
     */
    @Override
    public void execute(IClinic clinic, Validator validator) {
        clinic.updateClient(validator.getString("Имя клиента: "),
                validator.getString("Новоe имя клиента: "));
    }

    /**
     * {@inheritDoc}
     * @return сообщение для меню
     */
    @Override
    public String intro() {
        return String.format("%s-переименовать клиента",this.key());
    }

    /**
     * {@inheritDoc}
     * @return номер операции
     */
    @Override
    public int key() {
        return 3;
    }
}
