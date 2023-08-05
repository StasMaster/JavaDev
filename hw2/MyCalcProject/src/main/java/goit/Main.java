package goit;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is my calc!");
        System.out.println("sum is: " + new Calculator().add(50,70));
        System.out.println("sum is: " + new Calculator().div(50,0));
    }
}