package com.testexamples.demo.utility;

import com.testexamples.demo.constant.MessageConstants;
import com.testexamples.demo.exceptions.*;

import java.util.Objects;


//CREAR CLASE DE CONSTANTES PARA LOS MENSAJES DE LOS EXCEPCION
public class Utility{

    private static Utility utility;

    private Utility(){}

    public static  Utility getUtility(){
        if(utility==null){
            utility= new Utility();
        }
        return utility;
    }

    public static void checkInputInteger(final Object input) throws NonIntegerInputException {
        if(input.getClass() != Integer.class || !(input instanceof Integer)){
            throw new NonIntegerInputException(MessageConstants.ERROR_PARAM_INTEGER);
        }
    }
    public static void checkNullableInput(final Object input) throws NonParameterInputException {
        if(Objects.isNull(input)){
            throw new NonParameterInputException(MessageConstants.NULL_INPUT_PARAM);
        }
    }

    public static void checkDenominatorZero(final Object input) throws DenominatorZeroException {
        if((int)input == 0){
            throw new DenominatorZeroException(MessageConstants.ERROR_DIVISION_ZERO);
        }
    }
}