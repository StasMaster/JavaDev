package org.example;
import java.util.Scanner;

public class StringTransformer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        MyAspect myAspect = new MyAspect();
        myAspect.logInput(input);

        String transformed = transformString(input);

        myAspect.logTransformed(transformed);
        scanner.close();
    }

    public static String transformString(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (i % 2 == 0) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(Character.toLowerCase(c));
            }
        }
        return result.toString();
    }
}
