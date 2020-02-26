package com.testexamples.demo.utility;

import com.testexamples.demo.constant.MessageConstants;
import com.testexamples.demo.exceptions.*;

import java.util.Objects;


//CREAR CLASE DE CONSTANTES PARA LOS MENSAJES DE LOS EXCEPCION
public class Utility{

    public static void checkInputInteger(Object input) throws NonIntegerInputException {
        if(input.getClass() != Integer.class || !(input instanceof Integer)){
            throw new NonIntegerInputException(MessageConstants.ErrorParamInteger);
        }else{
            return;
        }
    }
    public static void checkNullableInput(Object input) throws NonParameterInputException {
        if(Objects.isNull(input)){
            throw new NonParameterInputException(MessageConstants.NullInputParam);
        }else{
            return;
        }
    }

    public static void checkDenominatorZero(Object input) throws DenominatorZeroException, NonIntegerInputException {
        checkInputInteger(input);
        if((int)input == 0){
            throw new DenominatorZeroException(MessageConstants.ErrorDivisionZero);
        }
    }
}