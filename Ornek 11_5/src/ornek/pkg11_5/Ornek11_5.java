/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ornek.pkg11_5;

import static ornek.pkg11_5.Metodum.DegFonk;
import static ornek.pkg11_5.Metodum.RefFonk;
import static ornek.pkg11_5.Metodum.s1;

/**
 *
 * @author Monster
 */
public class Ornek11_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Değerini al-işle ");
        DegFonk(s1);
        System.out.println("s1...:" + s1);
        System.out.println("Referansı al-işle");
        RefFonk(s1);
        System.out.println("s1...:"+s1);
        // TODO code application logic here
    }
    
}
