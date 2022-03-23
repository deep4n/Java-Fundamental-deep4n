package composition;

/**
 *
 * @author mhddf
 */
public class Book {
    private final String name;
    private final Author author;
    private final double price;
    private final int qty;
    
    public Book(String name, Author author, double price, int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    
    public String toString(){
        return this.name+" by "+this.author.getName()+" "+this.author.getGender()+" "+this.author.getEmail();
    }
    
}