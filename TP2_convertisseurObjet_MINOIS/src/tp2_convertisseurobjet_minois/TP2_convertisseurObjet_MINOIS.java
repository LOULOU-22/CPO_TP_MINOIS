/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_minois;

import java.util.Scanner;

/**
 *
 * @author lilou
 */
public class TP2_convertisseurObjet_MINOIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        Convertisseur convertisseur1 = new Convertisseur();
        Convertisseur convertisseur2 = new Convertisseur();

        boolean continuer = true;

        while (continuer) {
            // Affichage du menu
            System.out.println("\n--- Menu Convertisseur ---");
            System.out.println("1. Convertir Celsius vers Kelvin");
            System.out.println("2. Convertir Kelvin vers Celsius");
            System.out.println("3. Convertir Celsius vers Fahrenheit");
            System.out.println("4. Convertir Fahrenheit vers Celsius");
            System.out.println("5. Convertir Kelvin vers Fahrenheit");
            System.out.println("6. Convertir Fahrenheit vers Kelvin");
            System.out.println("7. Quitter");
            System.out.print("Choisissez une option : ");

            int choix = scanner.nextInt();

            if (choix == 7) {
                continuer = false;
                break;
            }

            // Saisie de la valeur à convertir
            System.out.print("Entrez la valeur à convertir : ");
            double valeur = scanner.nextDouble();
            double resultat = 0;

            // Appel de la méthode correspondante
            switch (choix) {
                case 1:
                    resultat = convertisseur1.celsiusVersKelvin(valeur);
                    System.out.println(valeur + " Celsius = " + resultat + " Kelvin");
                    break;
                case 2:
                    resultat = convertisseur1.kelvinVersCelsius(valeur);
                    System.out.println(valeur + " Kelvin = " + resultat + " Celsius");
                    break;
                case 3:
                    resultat = convertisseur1.celsiusVersFahrenheit(valeur);
                    System.out.println(valeur + " Celsius = " + resultat + " Fahrenheit");
                    break;
                case 4:
                    resultat = convertisseur1.fahrenheitVersCelsius(valeur);
                    System.out.println(valeur + " Fahrenheit = " + resultat + " Celsius");
                    break;
                case 5:
                    resultat = convertisseur1.kelvinVersFahrenheit(valeur);
                    System.out.println(valeur + " Kelvin = " + resultat + " Fahrenheit");
                    break;
                case 6:
                    resultat = convertisseur1.fahrenheitVersKelvin(valeur);
                    System.out.println(valeur + " Fahrenheit = " + resultat + " Kelvin");
                    break;
                default:
                    System.out.println("Option invalide !");
                    break;
            }
        }

        // Affichage des nombres de conversions
        System.out.println("\n" + convertisseur1);
        System.out.println("\nCréons un deuxième convertisseur et faisons quelques conversions supplémentaires...");
        convertisseur2.celsiusVersKelvin(100);
        convertisseur2.fahrenheitVersCelsius(212);
        System.out.println(convertisseur2);
        scanner.close();
    }
    
}
