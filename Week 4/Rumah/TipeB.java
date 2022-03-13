package Rumah;

/**
 *
 * @author mhddf
 */
public class TipeB extends Rumah{
    int kolamRenang;

    @Override
    int jumlah(){
        int jumlah = kolamRenang;
        System.out.println("Jumlah Kolam Renang : " + jumlah);
        return jumlah;
    }
}
