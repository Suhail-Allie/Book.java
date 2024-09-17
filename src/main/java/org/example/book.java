package org.example;

    public abstract class book {
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


