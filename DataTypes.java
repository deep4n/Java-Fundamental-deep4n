/*
 * Name    : Muhammad Dyfan Ramadhan
 * Class   : D4-A Informatic Engineering
 * Project : DataTypes
 */
package datatypes;
import java.util.Scanner;
/**
 *
 * @author mhddf
 */
public class DataTypes {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int angka; 
        int i; 
        
        //menyimpan data yang dimasukkan user
        Scanner input = new Scanner(System.in);  
        
        //input angka oleh user
        angka = input.nextInt();   
        
        //menampung kumpulan angka dimasukkan user
        String[] place = new String[angka];
        
        //melakukan pengulangan terhadap string
        for(i=0;i<angka;i++){
            place[i]=input.next();        
        }
        
        //menampilkan output 
        for(i=0;i<angka;i++){
            //try catch karena terdapat penggunaan if dalam if
            try{
                long fix = Long.parseLong(place[i]);
                System.out.println(fix + " can be fitted in :");
                if ((fix > -9223372036854775808L)&&(fix < 9223372036854775807L)){
                    System.out.println("*long");
                    if ((fix > -2147483648)&&(fix < 2147483647)){
                    System.out.println("*int");
                        if ((fix > -32768)&&(fix < 32767)){
                        System.out.println("*short");
                            
                        }
                    }
                } 
            }
            catch(NumberFormatException e){
                System.out.println(place[i] + " can't be fitted anywhere");
            }
        }
    }
}
