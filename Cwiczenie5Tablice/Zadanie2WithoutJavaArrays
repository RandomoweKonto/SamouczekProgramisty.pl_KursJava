//2. Napisz program pobierający trójelementową tablicę liczb i zwracający największą liczbę.

package pl.samouczekprogramisty.kursjava.cwiczenie5tablice;

import java.util.Scanner;

public class Zadanie2WithoutJavaArrays {

    public static int najwyzszyElementWTablicy(int [] array){
        if (array[0]>array[1] && array[0]>array[2]){
            System.out.println("Najwiekszym elementem w tablicy jest "+array[0]+".");
            return array[0];}
        else if (array[1]>array[0] && array[1]>array[2]){
            System.out.println("Najwiekszym elementem w tablicy jest "+array[1]+".");
            return array[1];}
        else if (array[2]>array[0] && array[2]>array[1]){
            System.out.println("Najwiekszym elementem w tablicy jest "+array[2]+".");
            return array[2];}
        else if (array[0]==array[1] && array[0]>array[2]){
            System.out.println("Najwiekszym elementem w tablicy jest "+array[0]+" i sa w niej dwa takie elementy.");
            return array[0];}
        else if (array[0]==array[1] && array[0]<array[2]){
            System.out.println("Najwiekszym elementem w tablicy jest "+array[2]+".");
            return array[2];}
        else if (array[1]==array[2] && array[1]>array[0]){
            System.out.println("Najwiekszym elementem w tablicy jest "+array[1]+" i sa w niej dwa takie elementy.");
            return array[1];}
        else if (array[1]==array[2] && array[1]<array[0]){
            System.out.println("Najwiekszym elementem w tablicy jest "+array[0]+".");
            return array[0];}
        else if (array[0]==array[2] && array[0]>array[1]){
            System.out.println("Najwiekszym elementem w tablicy jest "+array[0]+" i sa w niej dwa takie elementy.");
            return array[0];}
        else if (array[0]==array[2] && array[0]<array[1]){
            System.out.println("Najwiekszym elementem w tablicy jest "+array[1]+".");
            return array[1];}
        else {
            System.out.println("Najwiekszym elementem w tablicy jest "+array[0]+" i wszystkie elemety sa sobie rowne.");
            return array[0];}
        }

    public static void main(String[] args){

        Zadanie2WithoutJavaArrays zadanie = new Zadanie2WithoutJavaArrays();
        Scanner scanner = new Scanner(System.in);

        int [] tablica = new int [3];

        System.out.println("Podaj pierwszy element tablicy.");
        tablica[0] = scanner.nextInt();
        System.out.println("Podaj drugi element tablicy.");
        tablica[1] = scanner.nextInt();
        System.out.println("Podaj trzeci element tablicy.");
        tablica[2] = scanner.nextInt();

        najwyzszyElementWTablicy(tablica);
    }
}
