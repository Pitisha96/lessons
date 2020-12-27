package com.pitisha96.actions;

import com.pitisha96.IClinic;
import com.pitisha96.Validator;
import com.pitisha96.animals.Dog;

/**
 * Добавление нового питомца
 */
public class CreatePetAction implements Action {

    @Override
    public void execute(IClinic clinic, Validator validator) {
        clinic.addPet(validator.getString("Имя хозяина: "),new Dog(validator.getString("Имя питомца: ")));
    }

    @Override
    public String intro() {
        return String.format("%s-добавить питомца",this.key());
    }

    @Override
    public int key() {
        return 2;
    }
}
