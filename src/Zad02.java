/*2.	Napisz program, który rysuje literę X w kwadracie o zadanym rozmiarze.
* szukamy dwóch przekatnych (i==j)*/

import java.util.Scanner;

public class Zad02 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wymiar kwadratu: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) System.out.print("* "); //gwiazdka w punktach i==j (0 0) (1 1) itd
                //druga przekatna,np kwadrat n=4, indeks wierszy i, indeks kolumn j od 0 do 4
                // wiersz 0: i=0, j=4 (i+j=n-1); wiersz 1: i=1, j=3 (i+j=n-1), itd, czyli druga przekatna
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
