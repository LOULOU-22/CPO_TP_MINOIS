/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statistiques;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author lilou
 */
public class Statistiques {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[] faceCounts = new int[6]; 

        
        System.out.print("Entrez le nombre de lancers de dés (m) : ");
        int m = scanner.nextInt();

        
        Random generateurAleat = new Random();

        
        for (int i = 0; i < m; i++) {
            int face = generateurAleat.nextInt(6); 
            faceCounts[face]++; 
        }

       
        System.out.println("\nRésultats des lancers de dés :");
        for (int i = 0; i < faceCounts.length; i++) {
            System.out.println("Face " + (i + 1) + " : " + faceCounts[i] + " occurrence(s)");
        }

        // Afficher les résultats en pourcentages
        System.out.println("\nRésultats en pourcentages :");
        for (int i = 0; i < faceCounts.length; i++) {
            double percentage = (faceCounts[i] * 100.0) / m; 
            System.out.printf("Face %d : %.2f%%\n", (i + 1), percentage);
        }

        
        scanner.close();
    }
}

      