public class Book {

    //instance variables
    private String title;
    private String author;
    private String description;
    private double price;
    private boolean isInStock;
    private String sku;

    //constructors

    public Book() {
    }

    public Book(String title, String author, String description,
                double price, boolean isInStock) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }

    //instance methods

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getDisplayText() {
        return "Author: " + getAuthor() + "\n" +
                "Title: " + getTitle() + "\n" +
                "Description: " + getDescription();

    }

    public double getBookPricing(int numberOfBooks) {
        if (isInStock()) return getPrice() * numberOfBooks;
            // the method will return 0 if the book is not in stock
        else return 0; // this will be handled by the calling method
    }


}
