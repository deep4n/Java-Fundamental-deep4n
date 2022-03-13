package Rumah;

/**
 *
 * @author mhddf
 */
public class TipeA extends Rumah{
    int garasi;

    @Override
    int jumlah(){
        int jumlah = garasi;
        System.out.println("Jumlah Garasi : " + jumlah);
        return jumlah;
    }
}
