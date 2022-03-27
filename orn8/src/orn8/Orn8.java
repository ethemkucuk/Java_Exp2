/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orn8;
import java.util.Scanner;

/**
 *
 * @author Monster
 */
public class Orn8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sayac = 0;
        
            System.out.println(" Bir Sayı Giriniz:  ");
            int sayi = s.nextInt();
            
            while(sayi>0){
                sayi /= 10; // sayi = sayi /10
                sayac++;
            }
        System.out.println("Girdiginiz sayinin basamak sayisi = " + sayac);
        // TODO code application logic here
    }
    
}
