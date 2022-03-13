package anime;

/**
 *
 * @author mhddf
 */
public class Sasuke extends Itachi {
    String Dojutsu = "Sharingan";
    
    @Override
    void printDojutsu() {
        super.printDojutsu(); //Rinnegan,Mangekyou Sharingan
        System.out.println(this.Dojutsu); //Sharingan
    }
}




