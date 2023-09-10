package org.example;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclarePrecedence;

@Aspect
@DeclarePrecedence("MyAspect, StringTransformer")
public class MyAspect {
    private boolean loggingEnabled = true;

    public void enableLogging() {
        loggingEnabled = true;
    }

    public void disableLogging() {
        loggingEnabled = false;
    }

    @Before("execution(* StringTransformer.main(String)) && args(input)")
    public void logInput(String input) {
        if (loggingEnabled) {
            System.out.println("Введенная строка: " + input);
        }
    }

    @Before("execution(* StringTransformer.transformString(String)) && args(transformed)")
    public void logTransformed(String transformed) {
        if (loggingEnabled) {
            System.out.println("Преобразованная строка: " + transformed);
        }
    }
}
