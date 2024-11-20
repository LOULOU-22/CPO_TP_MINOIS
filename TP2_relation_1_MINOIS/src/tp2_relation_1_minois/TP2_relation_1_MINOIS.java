/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_minois;

/**
 *
 * @author lilou
 */
public class TP2_relation_1_MINOIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Création des voitures
        Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);
        Voiture uneTesla = new Voiture("Model S", "Tesla", 10);

        // Création des personnes
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");

        // Ajout de voitures à Bob
        System.out.println("\nAjout de voitures à Bob :");
        bob.ajouter_voiture(uneClio);
        bob.ajouter_voiture(uneMicra);

        // Ajout de voitures à Reno
        System.out.println("\nAjout de voitures à Reno :");
        reno.ajouter_voiture(uneAutreClio);
        reno.ajouter_voiture(une2008);
        reno.ajouter_voiture(uneTesla);

        // Affichage des propriétaires et de leurs voitures
        System.out.println("\nInformations sur les propriétaires :");
        System.out.println(bob);
        System.out.println(reno);
    }
}
