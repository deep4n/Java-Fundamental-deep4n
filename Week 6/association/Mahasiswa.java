package association;

/**
 *
 * @author mhddf
 */
class Mahasiswa extends ProgramStudi{
    String namaMahasiswa;
    Mahasiswa (String nama, String prodiM, int nimM){
        super (prodiM, nimM);
        this.namaMahasiswa = nama;
    }
}
