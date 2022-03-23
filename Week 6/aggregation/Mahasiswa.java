package aggregation;

/**
 *
 * @author mhddf
 */
public class Mahasiswa{
    int nim;
    String namaMahasiswa;
    Alamat alamat;
    Mahasiswa (int nim, String namaMahasiswa, Alamat almt){
        this.nim = nim;
        this.namaMahasiswa = namaMahasiswa;
        this.alamat = almt;
    }
    
    public static void main(String args[]){
        Alamat ad = new Alamat (31, "Padang","Sumatera Barat","Indonesia");
        Mahasiswa obj1 = new Mahasiswa (211524018, "Dyfan", ad);
        System.out.println(obj1.nim);
        System.out.println(obj1.namaMahasiswa);
        System.out.println(obj1.alamat.noRumah);
        System.out.println(obj1.alamat.kota);
        System.out.println(obj1.alamat.provinsi);
        System.out.println(obj1.alamat.negara);
    }
}

