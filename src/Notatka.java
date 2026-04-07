import java.util.Random;
import java.util.Scanner;

public class Notatka {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("----Gra-----");
        System.out.println("Zasady: Papier bije Kamień, Kamień bije Nożyce, Nożyce biją Papier.");
        System.out.println("Podaj wybór: 0-papier, 1-kamień, 2-nozyce");
        int gracz = scanner.nextInt();
        scanner.nextLine();

        int komuter = random.nextInt(3);
        String[] nazwy = {"Paier", "Kamień", "Nozyce"};
        System.out.println("Moja decyzja: " + nazwy[gracz]);
        System.out.println("Decyzja komputera: " + nazwy[komuter]);


        if (gracz == komuter) {
            System.out.println("Remiz");

        } else if ((gracz == 0 && komuter == 1) ||
        (gracz == 1 && komuter == 2) ||
                (gracz == 2 && komuter == 0)) {
            System.out.println("Wygrana");

        } else {
            System.out.println("Przegrana ");
        }


    }
}





