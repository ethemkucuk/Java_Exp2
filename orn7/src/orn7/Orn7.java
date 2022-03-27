/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orn7;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Monster
 */
public class Orn7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random rnd = new Random();
        int rastgele_sayi=1 + rnd.nextInt(49);
        System.out.println("Rastgele bir sayi 1-50 arasındadır");
        int sayi,sayac =0 ;
        
        do
        {
            System.out.println("Bir sayi giriniz: ");
            sayi=s.nextInt();
            if(sayi>rastgele_sayi){
                System.out.println(" Sayiyi Kücültün ");
            }
            else if(sayi<rastgele_sayi){
                System.out.println(" Sayiyi Büyültün ");
            }
            sayac++;
            
        }
        while(sayi != rastgele_sayi);
                System.out.println("Tebrikler!! " + sayac + ". denemede sayıyı buldunuz.");
        // TODO code application logic here
    }
    
}
