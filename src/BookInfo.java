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
        if (sku.equalsIgnoreCase("Java1001")) {
            return new Book("Head First Java",
                    "Kathy Sierra and Bert Bates",
                    "Easy to read Java workbook",
                    47.50, true);
        } else if (sku.equalsIgnoreCase("Java1002")) {
            return new Book("Thinking in Java",
                    "Bruce Eckel",
                    "Details about Java under the hood",
                    20.00, true);
        } else if (sku.equalsIgnoreCase("Orcl1003")) {
            return new Book("OCP: Oracle Certified Professional Java SE",
                    "Jeanne Boyarsky",
                    "Everything you need to know in one place",
                    45.00, true);
        } else if (sku.equalsIgnoreCase("Python1004")) {
            return new Book("Automate the Boring Stuff with Python",
                    "Al Sweigart",
                    "Fun with Python",
                    10.50, true);
        } else if (sku.equalsIgnoreCase("Zombie1005")) {
            return new Book("The Maker's Guide to the Zombie Apocalypse",
                    "Simon Monk",
                    "Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi",
                    16.50, true);
        } else if (sku.equalsIgnoreCase("Rasp1006")) {
            return new Book("Raspberry Pi Projects for the Evil Genius",
                    "Donald Norris",
                    "A dozen fiendishly fun projects for the Raspberry Pi!",
                    14.75, true);
        }
        // returns a blank book object if no match was found
        else return new Book ();
    }
}