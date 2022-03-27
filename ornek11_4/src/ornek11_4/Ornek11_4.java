/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ornek11_4;
import java.util.Scanner;
import static ornek11_4.Donusturucu.cevir;
/**
 *
 * @author Monster
 */
public class Ornek11_4 {

    private static Scanner gir;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double F,C;
        System.out.println("Fahrenayt Degeri: ");
        gir = new Scanner(System.in);
        F = gir.nextDouble();
        C = cevir(F);
        
        System.out.print(C+ " Derecedir");
        // TODO code application logic here
    }
    
}
