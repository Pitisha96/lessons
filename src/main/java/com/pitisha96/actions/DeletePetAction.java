package com.pitisha96.actions;

import com.pitisha96.IClinic;
import com.pitisha96.validators.Validator;

/**
 * Удаление питомца
 * @author Илья Петровский
 * @since 24.12.2020
 */
public class DeletePetAction implements Action {

    /**
     * {@inheritDoc}
     * @param clinic  Клиника
     * @param validator Валидатор ввода
     */
    @Override
    public void execute(IClinic clinic, Validator validator) {
        clinic.deletePet(validator.getString("Имя клиента: "),
                validator.getString("Имя питомца: "));
    }

    /**
     * {@inheritDoc}
     * @return пункт меню
     */
    @Override
    public String intro() {
        return String.format("%s-удалить питомца",this.key());
    }

    /**
     * {@inheritDoc}
     * @return номер операции
     */
    @Override
    public int key() {
        return 6;
    }
}
