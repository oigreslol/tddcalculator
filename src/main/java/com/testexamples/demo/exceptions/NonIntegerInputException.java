package com.testexamples.demo.exceptions;

public class NonIntegerInputException extends UtilityException{
    private static final long serialVersionUID = 1L;

    public NonIntegerInputException(String message) {
        super(message);
    }
}