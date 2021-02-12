package com.pitisha96.actions;

import com.pitisha96.Clinic;
import com.pitisha96.IClinic;
import com.pitisha96.validators.Validator;
import com.pitisha96.clients.Client;
import org.junit.jupiter.api.Test;

import java.io.StringReader;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class CreatePetActionTest {

    @Test
    void execute() {
        CreatePetAction test=new CreatePetAction();
        Validator validator=new Validator(new Scanner(new StringReader("Илья\nБакс")));
        IClinic clinic=new Clinic();
        Client client =new Client("Илья");
        clinic.addClient(client);
        test.execute(clinic,validator);
        List<Client> result=clinic.searchPet("Бакс");
        assertTrue(result.contains(client));
    }
}