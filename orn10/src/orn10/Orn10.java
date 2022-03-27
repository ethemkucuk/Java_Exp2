/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orn10;
import java.util.Scanner;
/**
 *
 * @author Monster
 */
public class Orn10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:   ");
        int sayi = s.nextInt();
        
        System.out.print("Girdiğiniz sayinin tersten yazılısı = ");
        while(sayi>0){
            System.out.print(sayi%10);
            sayi/= 10;
        
    }
        // TODO code application logic here
    }
    
}
