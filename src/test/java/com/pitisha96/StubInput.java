package com.pitisha96;

import com.pitisha96.validators.Validator;

import java.io.StringReader;
import java.util.Scanner;

public class StubInput {
    private final String[] answers;

    public StubInput(String[] answers){
        this.answers=answers;
    }

    public Validator validator(){
        StringBuilder text=new StringBuilder();
        for(String str: answers){
            text.append(str).append('\n');
        }
        return new Validator(new Scanner(new StringReader(text.toString())));
    }
}
