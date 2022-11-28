/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class JavaApplication20
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int angka;
        Scanner input = new Scanner(System.in);
        System.out.print("angka=");
        angka = input.nextInt();
        
        if (angka%2==0)
        {
            System.out.println("genap");
        }
        else
        {
            System.out.println("ganjil");
        }
        
        
    }
    
}
