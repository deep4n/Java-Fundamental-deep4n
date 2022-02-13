/*
 * Name    : Muhammad Dyfan Ramadhan
 * Class   : D4-A Informatic Engineering
 * Project : Strings
 */
package strings;
import java.util.Scanner;

/**
 *
 * @author mhddf
 */
public class Strings {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        Scanner input = new Scanner(System.in); 
        String x = input.nextLine(); 
        String y = input.nextLine();
  
        System.out.println(x.length()+y.length());
        System.out.println(x.length()<y.length());
            if (x.compareTo(y) > 0){
                System.out.println("Yes");
            }
            else if (x.compareTo(y) < 0 ){
                System.out.println("No");
            }
        System.out.println(x.substring(0,1).toUpperCase()+x.substring(1)+" "+y.substring(0,1).toUpperCase()+y.substring(1));
        
        
        
        
        
    }
    
}
