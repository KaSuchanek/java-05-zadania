package zadania;/*1.	Napisz program, który rysuje pusty kwadrat o zadanym boku.
 * Wymaga instrukcji if, która sprawdza, czy aktualna pozycja to krawędź
 * (pierwszy/ostatni wiersz lub kolumna)*/
//Zadanie01

import java.util.Scanner;

public class Zad01 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wymiar kwadratu: ");
        int n = scanner.nextInt(); //stawiamy gwaizdke tylko na brzegach: i==0, i==n-1 (pierwszy ostatni wiersz) oraz j==0 oraz j==n-1, inaczej spacja
        for (int i = 0; i < n; i++) { //przechodzimy przez wiersze
            for (int j = 0; j < n; j++) {//przechodzimy przez kolumne i gwiazdka z if
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); //dwie spacje jesli pierwszy print wypisuje dwa znaki
                }
            }
            System.out.println(); //pusta linia po kazdym wierszu
        }
    }
}
