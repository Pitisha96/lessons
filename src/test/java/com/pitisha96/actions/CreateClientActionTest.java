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

class CreateClientActionTest {

    @Test
    void execute() {
        CreateClientAction test=new CreateClientAction();
        Validator validator=new Validator(new Scanner(new StringReader("Илья")));
        IClinic clinic = new Clinic();
        test.execute(clinic,validator);
        Client expected=new Client("Илья");
        List<Client> actual=clinic.searchClient("Илья");
        assertTrue(actual.size()==1 && actual.contains(expected));
    }
}