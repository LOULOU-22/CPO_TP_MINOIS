/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessmynumber;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author lilou
 */
public class GuessMyNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        // Création du générateur de nombres aléatoires
        Random generateurAleat = new Random();

        // Scanner pour la saisie utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur le niveau de difficulté
        System.out.println("Choisissez un niveau de difficulté :");
        System.out.println("1. Facile (illimité)");
        System.out.println("2. Normal (10 essais)");
        System.out.println("3. Difficile (5 essais)");
        System.out.print("Entrez 1, 2 ou 3 : ");
        int difficulte = scanner.nextInt();

        // Définir les paramètres selon la difficulté
        int maxEssais = 0;
        if (difficulte == 2) {
            maxEssais = 10;
        } else if (difficulte == 3) {
            maxEssais = 5;
        }

        // Générer un nombre aléatoire entre 0 et 100
        int nombreADeviner = generateurAleat.nextInt(101);

        System.out.println("\nDevinez le nombre entre 0 et 100 !");
        if (difficulte == 2 || difficulte == 3) {
            System.out.println("Vous avez " + maxEssais + " essais.");
        }

        // Variables pour gérer le jeu
        int tentatives = 0;
        boolean gagne = false;

        // Boucle principale
        while (!gagne) {
            // Vérifier si l'utilisateur a encore des essais (en mode normal/difficile)
            if (difficulte != 1 && tentatives >= maxEssais) {
                System.out.println("Dommage ! Vous avez épuisé vos essais. Le nombre était " + nombreADeviner + ".");
                break;
            }

            // Demander à l'utilisateur de saisir un nombre
            System.out.print("Entrez votre proposition : ");
            int nombreUtilisateur = scanner.nextInt();
            tentatives++;

            // Comparer la saisie avec le nombre à deviner
            if (nombreUtilisateur == nombreADeviner) {
                System.out.println("Gagné ! Vous avez trouvé le nombre en " + tentatives + " tentative(s) !");
                gagne = true;
            } else if (nombreUtilisateur < nombreADeviner) {
                // Messages d'aide selon la difficulté
                if (difficulte == 3 && nombreADeviner - nombreUtilisateur > 20) {
                    System.out.println("Vraiment trop petit !");
                } else {
                    System.out.println("Trop petit !");
                }
            } else {
                if (difficulte == 3 && nombreUtilisateur - nombreADeviner > 20) {
                    System.out.println("Vraiment trop grand !");
                } else {
                    System.out.println("Trop grand !");
                }
            }
        }

        // Fin du jeu
        scanner.close();
    
    }
    
}
