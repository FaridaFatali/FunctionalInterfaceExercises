package org.example.evenNumbers;

import java.util.function.IntConsumer;

public class EvenNumberWithFunctionalInterface {
    private int sum = 0;
    private int product = 1;
    private int[] squared = new int[5];

    public static void main(String[] args) {
        EvenNumberWithFunctionalInterface evenNumbers = new EvenNumberWithFunctionalInterface();

        IntConsumer print = i -> System.out.println("i: " + i);
        IntConsumer sum = i -> evenNumbers.sum += i;
        IntConsumer product = i -> evenNumbers.product *= i;
        IntConsumer squared = i -> evenNumbers.squared[i / 2 - 1] = i * i;

        System.out.println("Printing numbers:");
        evenNumbers.doEvenNumberOperation(print, 10);

        evenNumbers.doEvenNumberOperation(sum, 10);
        System.out.println("\nSum: " + evenNumbers.sum);

        evenNumbers.doEvenNumberOperation(product, 10);
        System.out.println("\nProduct: " + evenNumbers.product);

        System.out.println("\nSquared:");
        evenNumbers.doEvenNumberOperation(squared, 10);
        for (int j : evenNumbers.squared) {
            System.out.println(j);
        }
    }

    public void doEvenNumberOperation(IntConsumer consumer, int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                consumer.accept(i);
            }
        }
    }
}
