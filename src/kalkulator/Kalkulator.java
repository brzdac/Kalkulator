/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

import java.util.Scanner;

/**
 *
 * @author brzdac
 */
public class Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
      
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Witam w kalkulatorze Malutkiej");
        System.out.println("Podaj liczbę a");
        
        double a = scan.nextDouble();
                
        System.out.println("Podaj liczbę b");
                
        double b = scan.nextDouble(); 
        
        double Suma = a+b;
              
        //System.out.println("Suma "+a+"+"+b+"="+(a+b));
        System.out.printf("Suma %.2f+%.2f=%.1f\n", a, b, Suma);
    }
    
}

