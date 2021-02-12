package com.pitisha96.actions;

import com.pitisha96.IClinic;
import com.pitisha96.validators.Validator;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class ShowClientsAction implements Action{
    /**
     * выводит список клиентов
     * @param clinic клиника
     * @param validator валидатор
     */
    @Override
    public void execute(IClinic clinic, Validator validator){
        clinic.getClients().values().forEach(c->{
            try{
                new PrintStream(System.out,false,"Windows-1251")
                        .println(c.getName());
            }catch (UnsupportedEncodingException e){
                e.printStackTrace();
            }
        });
    }

    /**
     * {@inheritDoc}
     * @return интро
     */
    @Override
    public String intro(){
        return String.format("%s-список клиентов",this.key());
    }

    /**
     * {@inheritDoc}
     * @return номер по списку
     */
    @Override
    public int key(){
        return 9;
    }

}
