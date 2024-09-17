package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

//book
    public abstract static class book {
        protected String title;
        protected double price;

        // Constructor to set the title
        public book(String title) {
            this.title = title;
        }

        // Getter for the title
        public String getTitle() {
            return title;
        }

        // Getter for the price
        public double getPrice() {
            return price;
        }

        // Abstract method to set the price
        public abstract void setPrice();
    }

//Fiction
    public static class Fiction extends org.example.book {

        // Constructor to set the title and price
        public Fiction(String title) {
            super(title);
            setPrice(); // Set the price for Fiction books
        }

        // Implement the abstract setPrice method
        @Override
        public void setPrice() {
            this.price = 24.99; // Set price for Fiction books
        }
    }

    //NonFiction
    public static class NonFiction extends org.example.book {

        // Constructor to set the title and price
        public NonFiction(String title) {
            super(title);
            setPrice(); // Set the price for NonFiction books
        }

        // Implement the abstract setPrice method
        @Override
        public void setPrice() {
            this.price = 37.99; // Set price for NonFiction books
        }
    }

    //UseBook
    public static class UseBook {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Prompt user for Fiction book title
            System.out.print("Enter the title of a Fiction book: ");
            String fictionTitle = input.nextLine();
            // Create Fiction book
            org.example.Fiction fictionBook = new org.example.Fiction(fictionTitle);

            // Prompt user for NonFiction book title
            System.out.print("Enter the title of a NonFiction book: ");
            String nonFictionTitle = input.nextLine();
            // Create NonFiction book
            org.example.NonFiction nonFictionBook = new org.example.NonFiction(nonFictionTitle);

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

    //BookArray
    public class BookArray {
        public static void main(String[] args) {
            // Create an array to hold 10 books
            org.example.book[] books = new org.example.book[10];
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
                        books[i] = new org.example.Fiction(title);  // Create Fiction book
                        validInput = true;
                    } else if (type.equals("N")) {
                        books[i] = new org.example.NonFiction(title);  // Create NonFiction book
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










}