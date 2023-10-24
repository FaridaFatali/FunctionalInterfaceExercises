package org.example;

// Greetings in different languages using Functional Interface

public class Greeting {
    public static void main(String[] args) {
        GreetingInterface greeting1 = (s) -> System.out.println("In English: " + s);
        greeting1.hello("Hello");

        GreetingInterface greeting2 = (s) -> System.out.println("\nIn French: " + s);
        greeting2.hello("Bonjour");

        GreetingInterface greeting3 = (s) -> System.out.println("\nIn Russian: " + s);
        greeting3.hello("Привет");

        GreetingInterface greeting4 = (s) -> System.out.println("\nIn Spanish: " + s);
        greeting4.hello("Hola");

        GreetingInterface greeting5 = (s) -> System.out.println("\nIn Azerbaijani: " + s);
        greeting5.hello("Salam");

        GreetingInterface greeting6 = (s) -> System.out.println("\nIn Turkish: " + s);
        greeting6.hello("Merhaba");

        GreetingInterface greeting7 = (s) -> System.out.println("\nIn Arabic: " + s);
        greeting7.hello("مرحبًا");

        GreetingInterface greeting8 = (s) -> System.out.println("\nIn Japanese: " + s);
        greeting8.hello("こんにちは");

        System.out.println("\n-------------------------------------\n");

        System.out.println("Choose randomly:");
        int i = (int) (Math.random() * 8);
        switch (i) {
            case 1 -> greeting1.hello("Hello");
            case 2 -> greeting2.hello("Bonjour");
            case 3 -> greeting3.hello("Привет");
            case 4 -> greeting4.hello("Hola");
            case 5 -> greeting5.hello("Salam");
            case 6 -> greeting6.hello("Merhaba");
            case 7 -> greeting7.hello("مرحبًا");
            case 8 -> greeting8.hello("こんにちは");
        }
    }
}

@FunctionalInterface
interface GreetingInterface {
    void hello(String s);
}
