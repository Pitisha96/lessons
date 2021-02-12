package com.pitisha96.actions;

import com.pitisha96.Clinic;
import com.pitisha96.IClinic;
import com.pitisha96.validators.Validator;
import com.pitisha96.clients.Client;
import org.junit.jupiter.api.Test;

import java.io.StringReader;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class UpdateClientActionTest {

    @Test
    void execute() {
        UpdateClientAction test=new UpdateClientAction();
        Validator validator=new Validator(new Scanner(new StringReader("Гриша\nСаня")));
        IClinic clinic=new Clinic();
        Client client=new Client("Гриша");
        Client expected=new Client("Саня");
        clinic.addClient(client);
        test.execute(clinic,validator);
        assertTrue(clinic.searchClient("Саня").contains(expected));
    }
}