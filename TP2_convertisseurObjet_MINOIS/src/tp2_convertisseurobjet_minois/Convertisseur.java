/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_minois;

/**
 *
 * @author lilou
 */
public class Convertisseur {
    private int nbConversions;

    // Constructeur : initialise nbConversions à 0
    public Convertisseur() {
        nbConversions = 0;
    }

    // Méthode pour convertir Celsius en Kelvin
    public double celsiusVersKelvin(double celsius) {
        nbConversions++;
        return celsius + 273.15;
    }

    // Méthode pour convertir Kelvin en Celsius
    public double kelvinVersCelsius(double kelvin) {
        nbConversions++;
        return kelvin - 273.15;
    }

    // Méthode pour convertir Celsius en Fahrenheit
    public double celsiusVersFahrenheit(double celsius) {
        nbConversions++;
        return (celsius * 9/5) + 32;
    }

    // Méthode pour convertir Fahrenheit en Celsius
    public double fahrenheitVersCelsius(double fahrenheit) {
        nbConversions++;
        return (fahrenheit - 32) * 5/9;
    }

    // Méthode pour convertir Kelvin en Fahrenheit
    public double kelvinVersFahrenheit(double kelvin) {
        nbConversions++;
        return (kelvin - 273.15) * 9/5 + 32;
    }

    // Méthode pour convertir Fahrenheit en Kelvin
    public double fahrenheitVersKelvin(double fahrenheit) {
        nbConversions++;
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    // Redéfinition de la méthode toString()
    @Override
    public String toString() {
        return "Nombre de conversions effectuées : " + nbConversions;
    } 
}
