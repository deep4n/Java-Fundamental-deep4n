package association;

/**
 *
 * @author mhddf
 */
public class Kampus{    
    public static void main(String args[]){
        Mahasiswa obj = new Mahasiswa("Muhammad Dyfan", "Teknik Informatika", 211524018);
        System.out.println(obj.namaMahasiswa+" adalah Mahasiswa dari Jurusan "+obj.programStudi
                           +" dengan NIM : "+obj.idMahasiswa);
    }
}
