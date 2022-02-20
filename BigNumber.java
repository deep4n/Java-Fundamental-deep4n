/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bignumber;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author mhddf
 */
public class BigNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner(System.in);
       String Inp1,Inp2;//tipe data string untuk Inp1,Inp2 
       
       Inp1=input.nextLine();//user input angka
       Inp2=input.nextLine();//user input angka
       input.close();
       
       //menampilkan input angka s1 + input angka s2
       System.out.println(new BigInteger(Inp1).add(new BigInteger(Inp2))); 
       //menampilkan input angka s1 * input angka s2
       System.out.println(new BigInteger(Inp1).multiply(new BigInteger(Inp2))); 
    }    
}

