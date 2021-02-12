package com.pitisha96.actions;

import com.pitisha96.IClinic;
import com.pitisha96.validators.Validator;

/**
 * Переименование питомца
 * @author Илья Петровский
 * @since 24.12.2020
 */
public class UpdatePetAction implements Action {

    /**
     * {@inheritDoc}
     * @param clinic  Клиника
     * @param validator Валидатор ввода
     */
    @Override
    public void execute(IClinic clinic, Validator validator) {
        clinic.updatePet(
                validator.getString("Имя хозяина питомца: "),
                validator.getString("Имя питомца: "),
                validator.getString("Новое имя питомца: ")
        );
    }

    /**
     * {@inheritDoc}
     * @return пункт меню
     */
    @Override
    public String intro() {
        return String.format("%s-переименовать питомца",this.key());
    }

    /**
     * {@inheritDoc}
     * @return номер операции
     */
    @Override
    public int key() {
        return 4;
    }
}
