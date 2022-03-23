package dependence;

/**
 *
 * @author mhddf
 */
public class EmailServiceImpl implements EmailService {
     @Override
     public void send(String to, String body){
         System.out.println("Sending email to : "+ to);
     } 
}

