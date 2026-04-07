package zadania;/*3.	Napisz program, który rysuje wycentrowaną piramidę z gwiazdek.
 * w każdym wierszu musimy zrobić dwie różne rzeczy zanim przejdziemy do nowej linii
 * odpowiednia ilosc spacji i odpowiednia ilosc gwaizdek*/

/*i=0 -> 1 gwiazdka
i=1 -> 3 gwiazdki
i=2 -> 5 gwiazdek
i=3 -> 7 gwiazdek
Każda liczba nieparzysta = 2*wiersz + 1
w kazdym wierszu przed gwaizdka potrzebujemy soacje zeby je wsysrkowac
i tych spacji jest n-1*/

import java.util.Scanner;

public class Zad03 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wymiar piramidy: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
