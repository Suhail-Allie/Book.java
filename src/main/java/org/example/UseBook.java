package org.example;
import java.util.Scanner;

public class UseBook {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Prompt user for Fiction book title
            System.out.print("Enter the title of a Fiction book: ");
            String fictionTitle = input.nextLine();
            // Create Fiction book
            Fiction fictionBook = new Fiction(fictionTitle);

            // Prompt user for NonFiction book title
            System.out.print("Enter the title of a NonFiction book: ");
            String nonFictionTitle = input.nextLine();
            // Create NonFiction book
            NonFiction nonFictionBook = new NonFiction(nonFictionTitle);

            // Display Fiction book details
            System.out.println("\nFiction Book Details:");
            System.out.println("Title: " + fictionBook.getTitle());
            System.out.println("Price: $" + fictionBook.getPrice());

            // Display NonFiction book details
            System.out.println("\nNonFiction Book Details:");
            System.out.println("Title: " + nonFictionBook.getTitle());
            System.out.println("Price: $" + nonFictionBook.getPrice());

            input.close();
        }
    }


