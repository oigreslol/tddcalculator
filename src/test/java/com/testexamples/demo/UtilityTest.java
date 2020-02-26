package com.testexamples.demo;

import static org.junit.jupiter.api.Assertions.assertThrows;
import com.testexamples.demo.exceptions.*;
import com.testexamples.demo.utility.Utility;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class UtilityTest {

    static Utility utility;

    @BeforeAll
    static void inicializador(){
        utility= new Utility();
    }

    @Tag("unitTest")
    @Test
    public void checkCorrectInput(){
        String firstInput = "1";
        assertThrows(NonIntegerInputException.class, ()-> Utility.checkInputInteger(firstInput));
    }

    @Tag("unitTest")
    @Test
    public void checkNullableInput(){
        assertThrows(NonParameterInputException.class, ()-> Utility.checkNullableInput(null));
    }

    @Tag("unitTest")
    @Test
    public void checkDenominatorZero(){
        //para el mensaje assertEquals(expected, actual, delta, messageSupplier);
        assertThrows(DenominatorZeroException.class, ()-> Utility.checkNullableInput(null));
    }

    @Tag("unitTest")
    @Test
    public void checkNullableInput2(){
        assertThrows(NonParameterInputException.class, ()-> Utility.checkNullableInput(null));
    }
}