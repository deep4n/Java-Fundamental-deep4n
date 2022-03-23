package composition;

/**
 *
 * @author mhddf
 */
public class Author {
    private final String name;
    private final String email;
    private final char gender;
    
    public Author (String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public String getGender(){
        if(this.gender == 'M'){
            return "(Male)";
        }
        return "(Female)";
    }
}
   
