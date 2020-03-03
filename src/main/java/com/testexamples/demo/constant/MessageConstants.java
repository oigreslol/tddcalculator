package com.testexamples.demo.constant;

public class MessageConstants {

    private static MessageConstants constatMessager;

    private MessageConstants(){}

    public static  MessageConstants getMessageConstats(){
        if(constatMessager==null){
            constatMessager= new MessageConstants();
        }
        return constatMessager;
    }

    public static final String ERROR_PARAM_INTEGER  = "Error: Param is not an Integer";
    public static final String ERROR_DIVISION_ZERO  = "Denominator is Zero, undefined operation";
    public static final String NULL_INPUT_PARAM = "Input is null, can't operate with a null reference";


}