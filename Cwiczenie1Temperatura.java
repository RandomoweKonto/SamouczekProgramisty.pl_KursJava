//1. Napisz metodę, która sprawdzi czy temperatura przekazana jako argument jest dodatnia.

package pl.samouczekprogramisty.kursjava;

import java.util.Scanner;

public class Cwiczenie1Temperatura {

    static void czyTemperaturaDodatnia (double temperatura){
        if (temperatura > 0){
            System.out.println("\nPodana temperatura jest dodatnia.\n");
        }
        else if (temperatura < 0){
            System.out.println("\nPodana temperatura jest ujemna.\n");
        }
        else {
            System.out.println("\nPodana temperatura jest nieujemna.\n");
        }
    }

    static void celsiusToFahrenheit(double temperatura){
        double temperaturaF = 32+9.0/5.0*temperatura;
        System.out.println("W przeliczeniu na stopnie Fahrenheita wynosi ona "+ temperaturaF +" stopni F.\n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj temperature.\n");
        double temperatura = scanner.nextDouble();
        czyTemperaturaDodatnia(temperatura);
        celsiusToFahrenheit(temperatura);
    }

}
