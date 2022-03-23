package dependence;

import java.util.Scanner;

/**
 *
 * @author mhddf
 */
public class UserView {
    
    private final Scanner scan = new Scanner(System.in);
    
    void show(){
        System.out.println("To : ");
        String to = scan.nextLine();
        
        System.out.println("Body : ");
        String body = scan.nextLine();
        
        System.out.println("Send [Y/N] : ");
        String option = scan.nextLine();
        
        if(option.equalsIgnoreCase("Y")){
            EmailServiceImpl emailService = new EmailServiceImpl();
            emailService.send(to, body);
        }    
    }
}

