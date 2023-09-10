package org.example;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclarePrecedence;
@Aspect
@DeclarePrecedence("MyAspect, StringTransformer")
public class MyAspect {
    private boolean loggingEnabled = true; // Глобальный флаг для управления логированием

    // Метод для включения логирования
    public void enableLogging() {
        loggingEnabled = true;
    }

    // Метод для отключения логирования
    public void disableLogging() {
        loggingEnabled = false;
    }

    // Метод для логирования начального значения строки
    @Before("execution(* StringTransformer.main(String)) && args(input)")
    public void logInput(String input) {
        if (loggingEnabled) {
            System.out.println("Введенная строка: " + input);
        }
    }

    // Метод для логирования преобразованного значения строки
    @Before("execution(* StringTransformer.transformString(String)) && args(transformed)")
    public void logTransformed(String transformed) {
        if (loggingEnabled) {
            System.out.println("Преобразованная строка: " + transformed);
        }
    }
}