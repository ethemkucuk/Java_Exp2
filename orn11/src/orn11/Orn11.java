/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orn11;

import java.util.Scanner;

/**
 *
 * @author Monster
 */
public class Orn11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int enbuyuk = 0,enkucuk = 0;
        
        int [] dizi = new int[10];
        
        for(int i = 0; i < 10; i++)
        {
            System.out.print("Dizinin " + (i+1) + ". elemanını giriniz: ");
            dizi[i] = scan.nextInt();
            if(i == 0) {
                enbuyuk = dizi[i];
                enkucuk = dizi[i];
            }
            if(dizi[i] > enbuyuk) {
                enbuyuk = dizi[i];
            }
            if(dizi[i] < enkucuk) {
                enkucuk = dizi[i];
            }
        }
        System.out.println("Dizinin en büyük elemanı = " + enbuyuk);
        System.out.println("Dizinin en kucuk elemanı = " + enkucuk);
        System.out.println("Fark = " + (enbuyuk - enkucuk));
    }
        
        // TODO code application logic here
    }
    

