/*Napisz program, który generuje szachownicę złożoną ze znaków X i O.
 *kluczem jest naprzemienność, mozna uzyskać ją, sprawdzając, czy suma współrzędnych (wiersz + kolumna) jest liczbą parzystą. */

import java.util.Scanner;

public class Zad04 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wymiar szachwonicy: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) { // wiersze
            for (int j = 0; j < n; j++) { // kolumny
                // Jeśli suma i + j jest parzysta, wypisz X, w przeciwnym razie O
                if ((i + j) % 2 == 0) {
                    System.out.print("X ");
                } else {
                    System.out.print("O ");
                }
            }
            System.out.println(); // nowa linia po każdym rzędzie
        }
    }
}