public class BookApp {

    public static void main(String[] args) {
        // create a book instance
        Book i =
                new Book ("Martian Chronicles", "Ray Bradbury",
                        "excellent collection of science fiction short stories",
                        6.16, true );
        System.out.println(i.getDisplayText());
        if (i.getBookPricing(10) > 0) {
            System.out.printf("$%.2f", i.getBookPricing(10));
        }
        else {
            System.out.println("The book is out of stock");
        }
        System.out.println();


    }
}