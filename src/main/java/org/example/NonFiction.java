package org.example;

    public class NonFiction extends book {

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


