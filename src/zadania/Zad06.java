package zadania;/*Napisz program, który rysuje grot strzały skierowany w prawo.
* dwa odwrocone trojkaty prostokatne */

import java.util.Scanner;

public class Zad06 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wymiar strzały: ");
        int n = scanner.nextInt();

// górny trójkąt zaczynamy od i=1, pierwsza gwaizdka w pierwszym wierszu
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) System.out.print("*");
            System.out.println();
        }

// odwrocony trójkąt, górna petla koniec gdy ma dokladnie n gwiazdek, nie chcemy powtarzac linii n gwiazdek, dlatego i=n-1, pozniej zmniejszamy
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) System.out.print("*");
            System.out.println();
        }
    }
}