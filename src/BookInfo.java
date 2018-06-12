public class BookInfo {

    // instance variables
    private Book book;

    // constructors
    public BookInfo() {
    }

    public BookInfo(String sku) {
        book = lookUpSku(sku);
    }

    public Book lookUpSku (String sku) {
        if (sku.equalsIgnoreCase("Java01")) {
            return new Book("Effective Java",
                    "Joshua Bloch",
                    "The Definitive Guide to Java Platform Best Practices",
                    35.00, true);
        } else if (sku.equalsIgnoreCase("Java1002")) {
            return new Book("Thinking in Java",
                    "Bruce Eckel",
                    "Details about Java under the hood",
                    20.00, true);
        } else if (sku.equalsIgnoreCase("Sql01")) {
            return new Book("SQL Cookbook",
                    "Anthony Molinaro",
                    "Everything you need to know in one place",
                    86.00, true);
        } else if (sku.equalsIgnoreCase("Sql02")) {
            return new Book("Head First SQL",
                    "Lynn Beighley",
                    "Your brain on SQL",
                    17.50, true);
        } else if (sku.equalsIgnoreCase("C++01")) {
            return new Book("The c++ programming language",
                    "Bjarne Stroustrup",
                    "Describes c++ programming language",
                    25.00, true);
        } else if (sku.equalsIgnoreCase("C++02")) {
            return new Book("Thinking in C++",
                    "Bruce Eckel",
                    "Ideal for anyone already familar in C",
                    20.00, true);
        }
        // returns a blank book object if no match was found
        else return new Book ();
    }
}