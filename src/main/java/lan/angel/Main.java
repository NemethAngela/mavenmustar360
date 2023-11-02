package lan.angel;

import java.util.Scanner;

/*Feladat 0360: Egy pincében, adott egy téglatest alakú tartály. Ki kell derítenie mennyi must fér el benne.
Kérje be a tartály három oldalának hosszát, majd számoltassa ki, a tartály térfogatát.
A téglatest térfogatának számítása:
V = abc
Mentés: mustar*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Beolvasás a felhasználótól
        System.out.println("Kérem adja meg az 'a' oldal hosszát: ");
        double a = scanner.nextDouble();

        System.out.println("Kérem adja meg a 'b' oldal hosszát: ");
        double b = scanner.nextDouble();

        System.out.println("Kérem adja meg a 'c' oldal hosszát: ");
        double c = scanner.nextDouble();

        // Térfogat kiszámítása
        double terfogat = a * b * c;

        // Eredmény kiírása
        System.out.println("A téglatest térfogata: " + terfogat);

        // Lezárjuk a Scanner-t
        scanner.close();
    }
}