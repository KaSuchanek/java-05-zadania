import java.util.Random;
import java.util.Scanner;

/*Kamień, Papier, Nożyce. Napisz program w symulujący grę Papier KAmień Nozyce.
Program powinien poprosić użytkownika o podanie ruchu (0 - papier, 1 - kamień, 2 -nozyce, następnie
wylosować ruch komputera z zakresu od 0 do 2 i porównać oba wybory, wyświetlić wynik gry: remis, wygraną użytkownika
lub wygraną komputera.
Zadanie07
 */
public class PapierKamienNozyce {
    public static void main(String[] args) {
        //tworzymy dwie instancje Scannera i Random
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        // pytamy o wybor uzytkowniak
        System.out.println("----Gra----");
        System.out.println("\"Zasady: Papier bije Kamień, Kamień bije Nożyce, Nożyce biją Papier.\"");
        System.out.println("Podaj wybór: 0-papier, 1-kamień, 2-nożyce");
        int gracz = scanner.nextInt();
        scanner.nextLine(); //czysci eneter pozostawiony w buforze
        int komputer = random.nextInt(3); //co tu sie dzieje losuj od 0 do 3//tablice

        String[] nazwy = {"Papier", "Kamień", "Nozyce"};
        System.out.println("Mój wybór: " + nazwy[gracz]);
        System.out.println("Komputer wybrał: " + nazwy[komputer]);

        if (gracz == komputer) {
            System.out.println("Remis");
        } else if ((gracz == 0 && komputer == 2) ||
                (gracz == 1 && komputer == 0) ||
                (gracz == 2 && komputer == 1)) {
            System.out.println("Wygrana");

        } else {
            System.out.println("Przegrana");
        }
    }
}
