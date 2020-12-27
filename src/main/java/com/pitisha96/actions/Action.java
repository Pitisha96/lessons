package com.pitisha96.actions;


import com.pitisha96.IClinic;
import com.pitisha96.Validator;

/**
 * Описывает действия программы
 * @author Илья Петровский
 * @since 20.12.2020
 */
public interface Action {
    /**
     * выполнить действия
     * @param clinic  Клиника
     * @param validator Валидатор ввода
     */
    void execute(final IClinic clinic, final Validator validator);

    /**
     * Описание действий
     * @return Описание
     */
    String intro();

    /**
     * Ключ
     * @return Ключ
     */
    int key();
}
