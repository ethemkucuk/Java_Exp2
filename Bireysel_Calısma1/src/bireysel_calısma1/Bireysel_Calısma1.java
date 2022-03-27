/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bireysel_calısma1;
import java.util.Scanner;

/**
 *
 * @author Monster
 */
public class Bireysel_Calısma1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Bir sayı girin :");
        int num = s.nextInt();
        int adet =0,toplam=0;
        while (num !=0){
        toplam=(num%10)+toplam;
        num/=10;
        ++adet;
        }
        System.out.println("Basamak Toplamı: " + toplam);
        // TODO code application logic here
    }
    
}
