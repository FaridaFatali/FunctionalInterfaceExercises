package org.example.book;

import java.util.*;
import java.util.function.BinaryOperator;

// Finding max and min page counts of the listed books

public class Comparing {
    public static void main(String[] args) {
        List<Book> books = init();

        books.forEach(System.out::println);
        System.out.println();

        System.out.println("Sorting for page count:");
        Comparator<Book> compareByPageCount = Comparator.comparingInt(Book::getPages);
        books.sort(compareByPageCount);
        for (Book b : books) {
            System.out.println(b);
        }

        BinaryOperator<Book> maxPageCount = BinaryOperator.maxBy(compareByPageCount);
        Book bookWithMaxPageCount = books.stream().reduce(maxPageCount).orElse(null);
        System.out.println("\nMax page count:\n" + bookWithMaxPageCount);

        BinaryOperator<Book> minPageCount = BinaryOperator.minBy(compareByPageCount);
        Book bookWithMinPageCount = books.stream().reduce(minPageCount).orElse(null);
        System.out.println("\nMin page count:\n" + bookWithMinPageCount);
    }

    private static List<Book> init() {
        return BookFactory.getBookList();
    }
}
