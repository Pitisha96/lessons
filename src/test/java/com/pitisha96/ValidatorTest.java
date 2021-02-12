package com.pitisha96;

import com.pitisha96.validators.Validator;
import org.junit.jupiter.api.Test;

import java.io.StringReader;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {
    @Test
    public void whenValidatorShouldThrowsUnsupportedOperationException()
    throws UnsupportedOperationException{
        Set<Integer> set=new LinkedHashSet<>();
        set.add(1);
        assertThrows(UnsupportedOperationException.class,()->
            new Validator(new Scanner(new StringReader("2")))
                    .getIntFromList("",set)
        );
    }

    @Test
    public void whenValidatorShouldThrowsIllegalArgumentException(){
        Set<Integer> set=new LinkedHashSet<>();
        set.add(1);
        assertThrows(IllegalArgumentException.class,()->
           new Validator(new Scanner(new StringReader("h")))
                   .getIntFromList("",set)
        );

    }

}