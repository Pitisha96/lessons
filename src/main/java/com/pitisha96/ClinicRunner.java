package com.pitisha96;

import com.pitisha96.actions.*;

import java.util.Scanner;


public class ClinicRunner {
    public static void main(String[] args) {
        try (Validator validator=new Validator(new Scanner(System.in))){
            SingleClinicUI clinic=new SingleClinicUI(new Clinic(),validator);
            clinic.loadActions(new CreateClientAction());
            clinic.loadActions(new ExitFromClinic());
            clinic.loadActions(new CreatePetAction());
            clinic.loadActions(new UpdateClientAction());
            clinic.loadActions(new UpdatePetAction());
            clinic.loadActions(new searchClientAction());
            clinic.loadActions(new deleteClientAction());
            clinic.loadActions(new DeletePetAction());
            clinic.loadActions(new SearchPetAction());
            do{
                try {
                    clinic.show();
                    clinic.doAction(validator);
                }catch (UnsupportedOperationException e){
                    System.out.println("такая операция не поддерживается");
                }catch (IllegalArgumentException e){
                    validator.getString("");
                    System.out.println("вы ввели не корректные данные");
                }
            }while(true);
        }
    }
}
