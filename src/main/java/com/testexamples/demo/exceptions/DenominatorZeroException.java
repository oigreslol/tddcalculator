package com.testexamples.demo.exceptions;

public class  DenominatorZeroException extends UtilityException{

    private static final long serialVersionUID = 5345842039415370801L;

    public DenominatorZeroException(String message) {
        super(message);
    }
}