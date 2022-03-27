/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orn4;

import java.util.Scanner;

/**
 *
 * @author Monster
 */
public class Orn4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("İlk Sayıyı Girin");
        int a = s.nextInt();
        System.out.println("İkinci Sayıyı Girin");
        int b = s.nextInt();
        
        int toplam = a+b;
        System.out.println("Sayıların Toplamı: " + toplam);
        // TODO code application logic here
    }
    
}
