/*
 * Name    : Muhammad Dyfan Ramadhan
 * Class   : D4-A Informatic Engineering
 * Project : Constans
 */
package constants;
/**
 *
 * @author mhddf
 */

public class Constants {
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        final double CM_PER_INCH = 2.54;
        double paperWidth = 8.5;
        double paperHeight = 11;
            System.out.println("Paper size in centimeters: " +
            paperWidth * CM_PER_INCH + " by " + paperHeight *
            CM_PER_INCH);
    }
}
