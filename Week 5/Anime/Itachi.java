package anime;

/**
 *
 * @author mhddf
 */
public class Itachi extends Rikudo {
    private String KekkeiGenkai = "Susanoo";
    private String Dojutsu = super.Dojutsu;
    
    void printKekkeiGenkai() {
        System.out.println(this.KekkeiGenkai); //Susanoo
    }

    void printDojutsu() {
        System.out.println(this.Dojutsu); //Rinnegan
        setDojutsu(); //Mengambil nilai setDojutsu
        System.out.println(this.Dojutsu); //Mangekyou Sharingan 
    }

    private void setDojutsu() {
        this.Dojutsu = "Mangekyou Sharingan";
    }
}

