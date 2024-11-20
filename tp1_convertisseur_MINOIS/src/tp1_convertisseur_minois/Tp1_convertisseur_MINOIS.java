/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_minois;
import java.util.Scanner;
/**
 *
 * @author lilou
 */
public class Tp1_convertisseur_MINOIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        System.out.println("Bonjour , saisissez une valeur : ");
        double valeur = scanner.nextDouble();
        
        System.out.println("Saississez la conversion que vous souhaitez effectuer : ");
        System.out.println("1) De Celsius vers Kelvin"); 
        System.out.println("2) De Kelvin vers Celsius");
        System.out.println("3) De Celsius vers Fahrenheit");
        System.out.println("4) De Fahrenheit vers Celsius");
        System.out.println("5) De Kelvin vers Fahrenheit");
        System.out.println("6) De Fahrenheit vers Kelvin");
        
        int choix = scanner.nextInt();
        
    if (choix == 1){
         System.out.println(valeur + " degres Clesius est égal a " + CelciusVersKelvin(valeur) + "Kelvin");
    } else if (choix == 2){
         System.out.println(valeur + " Kelvin est égal a " + KelvinVersCelcius(valeur) + "degres Clesius");
    } else if (choix == 3){
         System.out.println(valeur + " degres Clesius est égal a " + CelciusVersFahrenheit(valeur) + "degres degres Fahrenheit");
    } else if (choix == 4){
        System.out.println(valeur + " degres Fahrenheit est égal a " + FahrenheitVersCelcius(valeur) + "degres Clesius");
    } else if (choix == 5){
        System.out.println(valeur + " Kelvin est égal a " + KelvinVersFahrenheit(valeur) + "degres Fahrenheit");
    } else if (choix == 6){
        System.out.println(valeur + " degres Fahrenheit est égal a " + FahrenheitVersKelvin(valeur) + "Kelvin");
    }
    scanner.close();   
}
 
public static double CelciusVersKelvin(double tCelcius){
    return tCelcius + 273.15;
}

public static double KelvinVersCelcius(double tKelvin){
    return tKelvin - 273.15;
}

public static double CelciusVersFahrenheit(double tCelcius){
    return (tCelcius * 9/5)+ 32;
}

public static double FahrenheitVersCelcius(double tFahrenheit){
    return (tFahrenheit - 32) * 5/9 ;
}

public static double KelvinVersFahrenheit(double tKelvin){
  double celsius = KelvinVersCelcius(tKelvin);
    return CelciusVersFahrenheit(celsius);
}

public static double FahrenheitVersKelvins(double tFahrenheit){
    double celsius = FahrenheitVersCelcius(tFahrenheit);
    return CelciusVersKelvin(celsius);
}
}
