/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ders_11;

import java.util.Scanner;

/**
 *
 * @author Barış Adsız
 */
public class Ders_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number = input.nextInt();
        
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
        
        if(number + number2 > 10)
            System.out.print("Win Win Win!!!");
        else
            System.out.println("Lose!");
    }
    
}
