package com.pitisha96.actions;

import com.pitisha96.IClinic;
import com.pitisha96.Validator;

/**
 * Выход из системы
 */
public class ExitFromClinic implements Action {
    /**
     * {@inheritDoc}
     * @param clinic  Клиника
     * @param validator Валидатор ввода
     */
    @Override
    public void execute(IClinic clinic, Validator validator) {
        System.exit(0);
    }

    /**
     * {@inheritDoc}
     * @return пункт меню для выхода
     */
    @Override
    public String intro() {
        return String.format("%s-выход из системы",this.key());
    }

    /**
     * {@inheritDoc}
     * @return номер операции
     */
    @Override
    public int key() {
        return 9;
    }
}
