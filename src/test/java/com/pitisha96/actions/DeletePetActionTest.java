package com.pitisha96.actions;

import com.pitisha96.Clinic;
import com.pitisha96.IClinic;
import com.pitisha96.validators.Validator;
import com.pitisha96.animals.Dog;
import com.pitisha96.clients.Client;
import org.junit.jupiter.api.Test;

import java.io.StringReader;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class DeletePetActionTest {

    @Test
    void execute() {
        DeletePetAction test=new DeletePetAction();
        Validator validator=new Validator(new Scanner(new StringReader("Алекс\nВольт")));
        IClinic clinic =new Clinic();
        Client client=new Client("Алекс");
        clinic.addClient(client);
        clinic.addPet("Алекс",new Dog("Вольт"));
        test.execute(clinic,validator);
        assertFalse(clinic.searchPet("Вольт").contains(client));
    }
}