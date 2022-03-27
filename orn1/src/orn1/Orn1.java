/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orn1;

/**
 *
 * @author Monster
 */
public class Orn1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //İki değişkene aktarılan sayıların bir birine bölümünü ve kalanını ekrana yazdıran program


        int sayi = 25,bolen =4;
        int bolum = sayi/bolen;
        int kalan = sayi % bolen;
        System.out.println("İşlem:"+sayi+"/"+bolen);
        System.out.println("Bölüm = " + bolum);
        System.out.println("Kalan = " + kalan);
        
        // TODO code application logic here
    }
    
}
