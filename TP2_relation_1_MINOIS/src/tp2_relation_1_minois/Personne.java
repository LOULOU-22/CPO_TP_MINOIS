/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_minois;

/**
 *
 * @author lilou
 */
public class Personne {
     String prenom;
    String nom;
    int nbVoitures;
    Voiture[] liste_voitures;

    // Constructeur
    public Personne(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
        this.nbVoitures = 0;
        this.liste_voitures = new Voiture[3];
    }

    // Méthode pour ajouter une voiture
    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
        if (voiture_a_ajouter.proprietaire != null) {
            System.out.println("Erreur : cette voiture appartient déjà à " + voiture_a_ajouter.proprietaire.prenom);
            return false;
        }

        if (nbVoitures >= 3) {
            System.out.println("Erreur : " + prenom + " " + nom + " possède déjà 3 voitures.");
            return false;
        }

        liste_voitures[nbVoitures] = voiture_a_ajouter;
        voiture_a_ajouter.proprietaire = this;
        nbVoitures++;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(prenom).append(" ").append(nom).append(" possède ").append(nbVoitures).append(" voiture(s):\n");
        for (int i = 0; i < nbVoitures; i++) {
            sb.append(" - ").append(liste_voitures[i].modele).append("\n");
        }
        return sb.toString();
    }
}