package bkttpjln;

import java.util.Scanner;

/**
 *
 * @author mhddf
 */
public class BkTtpJln {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input plat nomor 4 mobil
        Scanner input = new Scanner(System.in);
		
        String platMobil = input.nextLine();
        String[] y = platMobil.split(" ");
        String hasil = "";
        
        for (String x : y){
            hasil += x;
        }

        long plat = Long.parseLong(hasil);

        if ((plat - 999999)%5 == 0){
            System.out.println("berhenti");
        }
        else {
            System.out.println("jalan");
        }
        input.close();
    }    
}
