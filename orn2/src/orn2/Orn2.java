/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orn2;

/**
 *
 * @author Monster
 */
public class Orn2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] dizi = { 223.4, -324.5, 150.0, 433.5, 551.5, 463.7, 59.7, -16.5 };
        double enKucuk = dizi[0];
        for(double sayi: dizi) // dizi içindeki herhangi sayı
        {
        if(enKucuk>sayi)
            enKucuk = sayi;
        }
        System.out.format("Dizideki En Küçük Sayı = %.2f \n", enKucuk);
        
        // TODO code application logic here
    }
    
}
