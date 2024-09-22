/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo1;
import java.util.Scanner;


/*
 * MINOIS Lilou TDC 20/09/2024
 * @author lilou
 */
public class Exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String  prenom;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Bonjour, quel est votre prénom ?");
        prenom = sc.nextLine();
        String msg = "Au revoir " + prenom;
        System.out.println(msg);   
    }
    
}
