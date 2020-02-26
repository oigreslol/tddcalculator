package com.testexamples.demo.exceptions;

public class NonParameterInputException extends UtilityException{
    private static final long serialVersionUID = -8350615782702347717L;

    public NonParameterInputException(String message) {
        super(message);
    }
}