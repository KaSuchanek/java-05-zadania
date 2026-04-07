package zadania;/*5.	Napisz program, który rysuje figurę klepsydry z gwiazdek.
* dwie piramidy połączone wierzchołkami: jedna odwrócona (góra), a druga zwykła (dół)*/

import java.util.Scanner;

public class Zad05 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wymiar szachwonicy: ");
        int n = scanner.nextInt();

        // gora- (odwrócona piramida)
        for (int i = 0; i < n / 2 + 1; i++) {
            // Spacje (ich liczba rośnie: 0, 1, 2...)
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Gwiazdki (ich liczba maleje)
            for (int j = 0; j < n - 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2. DOLNA CZĘŚĆ (zwykła piramida - bez wierzchołka, bo już jest)
        for (int i = 1; i <= n / 2; i++) {
            // Spacje (ich liczba maleje)
            for (int j = 0; j < (n / 2) - i; j++) {
                System.out.print(" ");
            }
            // Gwiazdki (ich liczba rośnie: 3, 5, 7...)
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
