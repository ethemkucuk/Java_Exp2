/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package örnek.pkg11.pkg3;

import java.util.Scanner;
import static örnek.pkg11.pkg3.Ornek11_3.enb; // İMPORT ETMEK GEREKİYOR.
import static örnek.pkg11.pkg3.Ornek11_3.enk;

/**
 *
 * @author Monster
 */
public class Örnek113 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        System.out.println("En Büyügü " + enb(a,b,c));
        System.out.println("En Kücügü " + enk(a,b,c));
        // TODO code application logic here
    }
    
}
