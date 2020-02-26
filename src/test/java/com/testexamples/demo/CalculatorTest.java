package com.testexamples.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


import com.testexamples.demo.logic.*;
import com.testexamples.demo.exceptions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;


class CalculatorTest {

    @InjectMocks
    static Calculator calculator;

    @BeforeEach
    public void initCalculatorInstance() {
        MockitoAnnotations.initMocks(this);
    }


    @Test()
    @Tag("UnitTest")
    @EnabledOnOs({OS.WINDOWS, OS.MAC})
    @DisabledOnOs(OS.LINUX)
    public void testSumWithParameterAsString(){
        String firstParameter = "1";
        assertThrows(NonIntegerInputException.class,()-> calculator.sum(firstParameter,firstParameter));
    }

    @Test()
    @Tag("UnitTest")
    @EnabledOnOs({OS.WINDOWS, OS.MAC})
    @DisabledOnOs(OS.LINUX)
    public void testNonOneParameterInput(){
        String firstParameter = "1";
        assertThrows(NonParameterInputException.class,()-> calculator.sum(null,firstParameter));
    }

    @Test()
    @Tag("UnitTest")
    @EnabledOnOs({OS.WINDOWS, OS.MAC})
    @DisabledOnOs(OS.LINUX)
    public void testNonParametersInput(){
        assertThrows(NonParameterInputException.class,()-> calculator.sum(null,null));
    }

    
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
                "4, 2, 6",
                "6, 3, 9",
                "18, 22, 40"
    })
	void testSum(int a, int b, int c) throws UtilityException {
        assertEquals(c, calculator.sum(a, b));
    }

    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
        "5, 7, 35",
        "9, 9, 81",
        "3, 0, 0"
    })
	void testMultiplication(int a, int b, int c) throws UtilityException {
        assertEquals(c, calculator.multiply(a, b));
    }

    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
        "15, 8, 7",
        "6, 20, -14",
        "10, 0, 10"
    })
	void testSubstraction(int a, int b, int c) throws UtilityException {
        assertEquals(c, calculator.substract(a, b));
    }

    @Tag("UnitTest")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
        "15, s, 7",
        "a, 20, -14",
        "a, b, 10"
    })
	void testSubstractionWithOneStringParameter(Object a, Object b, Object c) {
        assertThrows(NonIntegerInputException.class, () ->calculator.substract(a, b));
    }

    @Test()
    @Tag("UnitTest")
    @EnabledOnOs({OS.WINDOWS, OS.MAC})
    @DisabledOnOs(OS.LINUX)
    public void testDivisionZeroDenominator(){
        assertThrows(DenominatorZeroException.class,()-> calculator.sum(null,null));
    }

    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
        "21, 3, 7",
        "24, 5, 4",
        "89, 1, 89"
    })
	void testDivision(int a, int b, int c) throws UtilityException {
        assertEquals(c, calculator.divide(a, b));
    }

}
