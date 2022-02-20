/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package berhitung;

import java.util.Scanner;


/**
 *
 * @author mhddf
 */
public class Berhitung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char operator;
        int a,b,hasil;
        
        Scanner input = new Scanner(System.in);
        
        a = input.nextInt();
        operator = input.next().charAt(0);
        b = input.nextInt();
        input.close();
        
        if((a>=1&&b<=1000)&&(b>=1&&a<=1000)){
        switch (operator){
            case '+':
                hasil = a + b;
                System.out.println(hasil);
                break;
            case '-':
                hasil = a - b;
                System.out.println(hasil);
                break;
            case '*':
                hasil = a * b;
                System.out.println(hasil);
                break;
            case '/':
                hasil = a / b;
                System.out.println(hasil);
                break;
            case '%':
                hasil = a % b;
                System.out.println(hasil);
                break;
            default:
                System.out.println("Input Wrong");
            }
        }
        else{
            System.out.println("Input Wrong");
        }
    }
}

        
        
        
        
        
       
