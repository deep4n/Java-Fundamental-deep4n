/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gajiagent;

import java.util.Scanner;

/**
 *
 * @author mhddf
 */
public class GajiAgent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        int jmlhJual;
        double gajiPokok,bonus,potonganGaji,totalGaji,item;
        
        gajiPokok = 500000;
        item = 50000;
        
        Scanner input = new Scanner(System.in);
        jmlhJual=input.nextInt();
        
        if(jmlhJual>80){
            bonus =(jmlhJual*item*0.35);
            totalGaji=gajiPokok + bonus; 
        }
        else if(jmlhJual>=40){
            bonus =(jmlhJual*item*0.25);
            totalGaji=gajiPokok + bonus;       
        }
        else if(jmlhJual<15){
            jmlhJual=15-jmlhJual;
            potonganGaji=(jmlhJual*item*0.15);
            totalGaji=gajiPokok - potonganGaji;        
        }
        else{
            bonus=(jmlhJual*item*0.1);
            totalGaji=gajiPokok + bonus;        
        }
        System.out.println((int)totalGaji);                
    }        
}
   
