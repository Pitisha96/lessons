package com.pitisha96.actions;

import com.pitisha96.Clinic;
import com.pitisha96.IClinic;
import com.pitisha96.validators.Validator;
import com.pitisha96.animals.Dog;
import com.pitisha96.animals.Pet;
import com.pitisha96.clients.Client;
import org.junit.jupiter.api.Test;

import java.io.StringReader;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class UpdatePetActionTest {

    @Test
    void execute() {
        UpdatePetAction test=new UpdatePetAction();
        Validator validator=new Validator(new Scanner(new StringReader("Илья\nБакс\nВольт")));
        IClinic clinic=new Clinic();
        Client client=new Client("Илья");
        Pet pet=new Dog("Бакс");
        clinic.addClient(client);
        clinic.addPet("Илья",pet);
        test.execute(clinic,validator);
        assertTrue(clinic.searchPet("Вольт").contains(client));

    }
}