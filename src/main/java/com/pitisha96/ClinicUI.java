package com.pitisha96;

import com.pitisha96.actions.Action;

/**
 * Интерфейс пользователя
 * @author Илья Петровский
 * @since 20.12.2020
 */
public interface ClinicUI {
    /**
     * Добавление нового действия в клинику
     * @param action новое действие
     */
    void loadActions(Action action);

    /**
     * Вывод меню клиники
     */
    void show();
}
