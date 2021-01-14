package com.pitisha96.actions;

import com.pitisha96.Clinic;
import com.pitisha96.IClinic;
import com.pitisha96.Validator;
import com.pitisha96.clients.Client;
import org.junit.jupiter.api.Test;

import java.io.StringReader;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class deleteClientActionTest {

    @Test
    void execute() {
        deleteClientAction test=new deleteClientAction();
        Validator validator =new Validator(new Scanner(new StringReader("Гена")));
        IClinic clinic=new Clinic();
        Client client=new Client("Гена");
        clinic.addClient(client);
        test.execute(clinic,validator);
        assertFalse(clinic.searchClient("Гена").contains(client));
    }
}