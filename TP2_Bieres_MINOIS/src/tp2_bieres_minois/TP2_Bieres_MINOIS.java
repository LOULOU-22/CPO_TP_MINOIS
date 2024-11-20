/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_minois;

/**
 *
 * @author lilou
 */
public class TP2_Bieres_MINOIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BouteilleBiere biere1 = new BouteilleBiere("Cuvée des Trolls", 7.0f, "Dubuisson");
        BouteilleBiere biere2 = new BouteilleBiere("Leffe", 6.6f, "Abbaye de Leffe");
        BouteilleBiere biere3 = new BouteilleBiere("Guinness", 4.2f, "Guinness Brewery");
        BouteilleBiere biere4 = new BouteilleBiere("Chimay Bleue", 9.0f, "Abbaye de Scourmont");

        
        System.out.println("Affichage des bières :");
        biere1.lireEtiquette();
        biere2.lireEtiquette();
        biere3.lireEtiquette();
        biere4.lireEtiquette();

        
        System.out.println("\nDécapsulage des bières et affichage :");
        biere1.decapsuler();
        biere3.decapsuler();
        
       
        System.out.println(biere1);
        System.out.println(biere2);
        System.out.println(biere3);
        System.out.println(biere4);
    }
    
}
