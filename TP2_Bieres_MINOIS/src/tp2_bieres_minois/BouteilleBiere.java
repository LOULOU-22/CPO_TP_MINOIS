/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_minois;

/**
 *
 * @author lilou
 */
public class BouteilleBiere {
    String nom;               
    float degreAlcool;        
    String brasserie;         
    boolean ouverte;          

    
    public BouteilleBiere(String unNom, float unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false; 
    }

   
    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degrés) \nBrasserie : " + brasserie);
    }

    
    public boolean decapsuler() {
        if (!ouverte) {
            ouverte = true;
            System.out.println("La bière " + nom + " a été ouverte !");
            return true; 
        } else {
            System.out.println("Erreur : La bière " + nom + " est déjà ouverte !");
            return false; 
        }
    }

    
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés) \nBrasserie : " + brasserie + "\nOuverte ? ";
        chaine_a_retourner += (ouverte ? "oui" : "non");
        return chaine_a_retourner;
    }
}
