/*8.	Napisz program w Java symulujący grę „Oczko”.
Program powinien losować karty o wartościach od 2 do 11 i dodawać je do sumy punktów gracza.
Po każdej wylosowanej karcie program wyświetla aktualną sumę i pyta gracza, czy chce dobrać kolejną kartę.
Gra kończy się, gdy gracz osiągnie lub przekroczy 21 punktów albo zdecyduje się zakończyć dobieranie.
Na końcu program wyświetla wynik.

Zadanie08*/

import java.util.Random;
import java.util.Scanner;

public class Oczko {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int suma = 0;
        String decyzja = "";
        System.out.println("=== Gra Oczko ===");
        System.out.println("Celem jest zbliżenie się do 21 punktów, ale nie możesz przekroczyć 21.");
//robimy klasyczne do while
        do {
            int losuj = random.nextInt(10) + 2; //jakos nalezy zasymulowac liczebnosc na karcie od 2-11
            // losujemy z 10 ale ze idzie od 0 to musimy dodac 2
            suma += losuj;
            System.out.println("Wylosowałes: " + losuj);
            System.out.println("Suma: " + suma);
            System.out.println("Czy gramy dalej (tak/nie): ");
            decyzja = scanner.nextLine().toLowerCase();

        } while (decyzja.equals("tak"));
        // Wyświetlenie końcowego wyniku
        if (suma == 21) {
            System.out.println("Brawo! Dokładnie 21 punktów – wygrana!");
        } else if (suma > 21) {
            System.out.println("Przekroczyłeś 21 punktów – przegrana!");
        } else {
            System.out.println("Zakończyłeś grę przy " + suma + " punktach.");
        }
    }
}
