package org.example.evenNumbers;

public class EvenNumberWithLambda {
    int sum = 0;
    int product = 1;
    int[] squares = new int[8];

    public static void main(String[] args) {
        System.out.println("i:");
        doIt(16, System.out::println);
        EvenNumberWithLambda number = new EvenNumberWithLambda();

        doIt(16, k -> number.sum += k);
        System.out.println("\nSum: " + number.sum);

        doIt(16, k -> number.product *= k);
        System.out.println("\nProduct: " + number.product);

        doIt(16, k -> number.squares[k / 2 - 1] = k * k);
        System.out.println("\nSquares:");
        for (int i : number.squares) {
            System.out.println(i);
        }
    }

    public static void doIt(int n, EvenNumberOperation operation) {
        for (int i = 2; i <= n; i += 2) {
            operation.operate(i);
        }
    }
}