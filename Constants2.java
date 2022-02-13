/*
 * Name    : Muhammad Dyfan Ramadhan
 * Class   : D4-A Informatic Engineering
 * Project : Constans2
 */
package constants2;

/**
 *
 * @author mhddf
 */
public class Constants2 {
    public static final double CM_PER_INCH = 2.54;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double paperWidth = 8.5;
        double paperHeight = 11;
            System.out.println("Paper size in centimeters: " + paperWidth *
            CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
    } 
}
