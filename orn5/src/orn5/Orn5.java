/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orn5;

/**
 *
 * @author Monster
 */
public class Orn5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int taban = 3,kuvvet = 4;
        long sonuc =1;
        
        while(kuvvet != 0)
        {
        sonuc *= taban;
        --kuvvet;
        }
        System.out.println("CEVAP == " +sonuc);
        // TODO code application logic here
    }
    
}
