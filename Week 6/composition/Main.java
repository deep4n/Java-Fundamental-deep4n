package composition;

/**
 *
 * @author mhddf
 */
public class Main {
    
    public static void main (String args[]){
        Author a = new Author("Muhammad Dyfan", "mhddfn05@gmail.com", 'M');
        Book b = new Book("Laskar Pelangi", a, 60000, 10);
        System.out.println(b);
    }
}
