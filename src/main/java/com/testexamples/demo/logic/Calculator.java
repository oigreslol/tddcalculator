package com.testexamples.demo.logic;

import com.testexamples.demo.exceptions.*;
import com.testexamples.demo.utility.Utility;


public class Calculator {

    public int sum(Object a, Object b) throws UtilityException{
        checkInputs(a,b);
        return (int) a + (int) b;
    }

    public int multiply (Object a, Object b) throws UtilityException{
        checkInputs(a,b);
        return (int) a * (int) b;
    }

    public int substract (Object a, Object b) throws UtilityException {
        checkInputs(a,b);
        return (int) a - (int) b;
    }

    public int divide(Object a, Object b) throws UtilityException {
        checkInputs(a,b);
        checkDenominator(b);
        return (int) a / (int)b;
    }

    public void checkInputs(Object a, Object b) throws UtilityException {
        Utility.checkNullableInput(a);
        Utility.checkNullableInput(b);
        Utility.checkInputInteger(a);
        Utility.checkInputInteger(b);
    }
    public void checkDenominator(Object a) throws UtilityException {
        Utility.checkDenominatorZero(a);
    }
}