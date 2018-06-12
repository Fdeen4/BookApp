public class BookApp {

    public static void main(String[] args) {
        // create a book instance
        Book b =
                new Book ("Clean Architecture ", "Robert C. Martin",
                        "A craftman's guide to software structure and design",
                        9.082, true );
        System.out.println(b.getDisplayText());
        if (b.getBookPricing(10) > 0) {
            System.out.printf("Price: $%.2f", b.getBookPricing(10));
        }
        else {
            System.out.println("The book is out of stock");
        }
        System.out.println();

//        BookInfo bd = new BookInfo();
//        Book b2 = bd.lookUpSku("Java01");
//        System.out.println(b2.getDisplayText());
    }
}