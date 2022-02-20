/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inout2;

import java.util.Scanner;

/**
 *
 * @author mhddf
 */
public class InOut2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
        String x1 = input.next();
        int    y1 = input.nextInt();
        String x2 = input.next();
        int    y2 = input.nextInt();
        String x3 = input.next();
        int    y3 = input.nextInt();
        
        System.out.println("================================");           
        System.out.printf("%-15s%03d %n",x1,y1);
        System.out.printf("%-15s%03d %n",x2,y2);
        System.out.printf("%-15s%03d %n",x3,y3);
        System.out.println("================================");       
    }   
}
