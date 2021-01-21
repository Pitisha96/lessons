package com.pitisha96.actions;

import com.pitisha96.IClinic;
import com.pitisha96.Validator;
import com.pitisha96.clients.Client;

import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * Поиск клиента по имени
 * @author Илья Петровский
 * @since 24.12.2020
 */
public class searchClientAction implements Action{

    /**
     * {@inheritDoc}
     * @param clinic  Клиника
     * @param validator Валидатор ввода
     */
    @Override
    public void execute(IClinic clinic, Validator validator) {
        List<Client> clients=clinic.searchClient(validator.getString("Имя клиента: "));
        System.out.println("\nРезультат поиска:");
        clients.forEach(c->{
            try {
                PrintStream stream = new PrintStream(System.out, false, "Windows-1251");
                stream.println(c.getName());
            }catch (UnsupportedEncodingException e){
                e.printStackTrace();
            }
        });
    }

    /**
     * {@inheritDoc}
     * @return пункт меню
     */
    @Override
    public String intro() {
        return String.format("%s-найти клиента",this.key());
    }

    /**
     * {@inheritDoc}
     * @return номер операции
     */
    @Override
    public int key() {
        return 7;
    }
}
