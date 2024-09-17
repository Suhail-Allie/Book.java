package org.example;

    public class Fiction extends book {

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


