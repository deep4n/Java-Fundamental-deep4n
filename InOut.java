package inout;
import java.util.Scanner;

/**
 *
 * @author mhddf
 */
public class InOut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        String s = input.nextLine(); 
        input.close(); //untuk menutup koneksi input stream
               
        s = s.trim(); //untuk menghapus spasi pada awal dan akhir kata
        
        if (s.length() == 0) { //jika tidak ada input yang dimasukkan, maka hasil output 0
        System.out.println(0);
        return;
        }
               
        String[] kata = s.split("[^a-zA-Z]+"); //untuk memisahkan [^a-zA-Z] pada string s
        System.out.println(kata.length);
        
        for (String text : kata){ 
        System.out.println(text);     
        }
    }
}
