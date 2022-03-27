/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orn9;
import java.util.Scanner;

/**
 *
 * @author Monster
 */
public class Orn9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int toplam = 0, rakam;
        
        System.out.print("Bir sayi giriniz: ");
        int sayi = s.nextInt();
        
        while(sayi>0){
        rakam = sayi%10;
        System.out.println(rakam + "' ın karesi = " + (rakam * rakam));
        toplam += (rakam*rakam);
        sayi /= 10;
        }
        System.out.println("Girilen sayinin karelerinin toplamı = " + toplam);
        // TODO code application logic here
    }
    
}
