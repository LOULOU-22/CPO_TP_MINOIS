/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo2;

import java.util.Scanner;

/**
 * MINOIS Lilou TDC 20/09/2024
 * @author lilou
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaration des variables
        int nb; // nombre d entiers a additionner
        int result; // resultat
        int ind; //indice
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Entrer le nombre : ");
        nb = sc.nextInt(); // On demande a sc de donner le prochain entier·

        result = 0;
        // Addition des nb premiers entiers
        ind = 1;
        while (ind <= nb) {
            result = result + ind;
            ind = ind + 1; // ind++;
        }
        // Affichage du resultat
        System.out.println();
        System.out.println("La somme des " + nb + " entiers est : " + result);
    }

}
