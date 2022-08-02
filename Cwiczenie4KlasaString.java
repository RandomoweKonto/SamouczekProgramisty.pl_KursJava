//4. Napisz program, który wyświetli trzy różne zdania opisujące aktualną pogodę. W czwartej linii wypisz sumaryczną długość trzech poprzednich zdań.

package pl.samouczekprogramisty.kursjava;

public class Cwiczenie4KlasaString {
    public static void main(String[] args) {
        String Zdanie1 = "Dziś rano było dosyć chłodno jak na lipiec.\n";
        String Zdanie2 = "Tylko 16C.\n";
        String Zdanie3 = "Popoludniu natomiast padal deszcz.\n";
        int dlugosc = Zdanie1.length()+Zdanie2.length()+Zdanie3.length();

        System.out.println(Zdanie1 + Zdanie2 + Zdanie3);
        System.out.println("Sumaryczna ilosc znakow poprzednich trzech zdan wynosi "+dlugosc);

    }
}
