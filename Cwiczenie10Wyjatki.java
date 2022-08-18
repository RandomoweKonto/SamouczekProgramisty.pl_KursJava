//Napisz program, który pobierze od użytkownika liczbę i wyświetli jej pierwiastek. Do obliczenia pierwiastka możesz
// użyć istniejącej metody java.lang.Math.sqrt(). Jeśli użytkownik poda liczbę ujemną rzuć wyjątek
// java.lang.IllegalArgumentException. Obsłuż sytuację, w której użytkownik poda ciąg znaków, który nie jest liczbą.

package pl.samouczekprogramisty.kursjava;

import java.util.Scanner;
import java.lang.IllegalArgumentException;
import java.util.InputMismatchException;
import java.lang.Math;

public class Cwiczenie10Wyjatki {

    public static double SquareRoot(double number){

        return Math.sqrt(number);

    }

    public static void Exceptions(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe, z ktorej obliczymy pierwiastek kwadratowy:");
        double number = scanner.nextDouble();

        if (number<0){

            try {
                throw new IllegalArgumentException("Podaj liczbe wieksza lub rowna zero!");
            }

            catch (IllegalArgumentException iae){
                System.out.println(iae);
                System.out.println("Pierwiastek z liczby "+(number)*-1+" wynosi "+SquareRoot((number)*-1));
            }

        }
        else {

            System.out.println("Pierwiastek z liczby " + number + " wynosi " + SquareRoot(number));

        }

    }

    public static void main(String[] args) {

        try {
            Exceptions();
        }

        catch (InputMismatchException ime) {
            System.out.println(ime+": Podaj liczbe, a nie ciag znakow!");
        }

    }

}
