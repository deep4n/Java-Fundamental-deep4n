package Rumah;

/**
 *
 * @author mhddf
 */
public class Main {
    public static void main(String[] args) {
        Rumah rumah = new Rumah();
        
        TipeA tipeA = new TipeA();
        tipeA.garasi = 2;
        
        TipeB tipeB = new TipeB();
        tipeB.kolamRenang = 3;
        
        rumah.jumlah();
   
        tipeA.jumlah();
        
        tipeB.jumlah();

    }
    
}
