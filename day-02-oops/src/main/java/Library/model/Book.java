package Library.model;

public class Book {
    private String title;
    private String author;
    private double price;
    private String isbn;
    static int totalBooksCreated;

    public Book(String title,String author,double price,String isbn){
        setTitle(title);
        setAuthor(author);
        setPrice(price);
        setIsbn(isbn);
        totalBooksCreated++;
    }

    public String getTitle(){

        return title;
    }
    public void setTitle(String title){
        if(title==null || title.isBlank()){
            throw new IllegalArgumentException("title cannot be null");
        }
        this.title=title;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public String getIsbn(){
        return isbn;
    }
    public void setAuthor(String author){
        if(author==null || author.isBlank()){
            throw new IllegalArgumentException("author cannot be null");
        }
        this.author=author;
    }
    public void setPrice(double price){
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }
    public void setIsbn(String isbn){
        if (isbn == null || isbn.isBlank()) {
            throw new IllegalArgumentException("ISBN cannot be blank");
        }
        this.isbn = isbn;
    }
    public static int getTotalBooksCreated(){
        return totalBooksCreated;
    }
    public void displayBookInfo(){
        System.out.println("Title: "+ title+ " | Author: "+ author+" | price: "+ price+" | ISBN: "+isbn);
    }
}
