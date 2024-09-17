package org.example;
import java.util.Scanner;

public class BookArray {
        public static void main(String[] args) {
            // Create an array to hold 10 books
            book[] books = new book[10];
            Scanner input = new Scanner(System.in);

            // Loop to gather input for 10 books
            for (int i = 0; i < books.length; i++) {
                String title;
                String type;
                boolean validInput = false;

                // Prompt for the title
                System.out.print("Enter the title of book " + (i + 1) + ": ");
                title = input.nextLine();

                // Prompt for Fiction or NonFiction, and keep asking until valid input
                while (!validInput) {
                    System.out.print("Is this a Fiction (F) or NonFiction (N) book? ");
                    type = input.nextLine().toUpperCase();

                    if (type.equals("F")) {
                        books[i] = new Fiction(title);  // Create Fiction book
                        validInput = true;
                    } else if (type.equals("N")) {
                        books[i] = new NonFiction(title);  // Create NonFiction book
                        validInput = true;
                    } else {
                        System.out.println("Invalid input. Please enter 'F' for Fiction or 'N' for NonFiction.");
                    }
                }
            }

            // Display details of all books
            System.out.println("\nBook List:");
            for (int i = 0; i < books.length; i++) {
                System.out.println("Book " + (i + 1) + ":");
                System.out.println("Title: " + books[i].getTitle());
                System.out.println("Price: $" + books[i].getPrice());
                System.out.println();
            }

            input.close();
        }
    }


