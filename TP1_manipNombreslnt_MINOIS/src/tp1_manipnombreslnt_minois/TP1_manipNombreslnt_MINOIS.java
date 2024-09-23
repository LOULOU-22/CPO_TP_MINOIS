/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombreslnt_minois;

import java.util.Scanner;

/**
 ** MINOIS Lilou TDC 20/09/2024
 * @author lilou
 */
public class TP1_manipNombreslnt_MINOIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int var1; // variable 1
        int var2; // variable 2
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Entrer le premier nombre : ");
        var1 = sc.nextInt(); 
        System.out.println("\n Entrer le deuxième nombre : ");
        var2 = sc.nextInt(); 
        int somme = var1 + var2;
        int difference = var1 - var2;
        int produit = var1 * var2;
        System.out.println("\n Voici la somme de vos deux nombres : "+ somme +"\n Voici la diffèrence de vos deux nombres : "+ difference  +"\n Voici le produit de vos deux nombres : "+ produit );
        int modulo = var1 % var2;
        int division = var1 / var2;    
        System.out.println(" Voici la division de vos deux nombres :\n Avec comme quotient :  "+ division +" et comme reste : "+ modulo); 
    }
    
}
