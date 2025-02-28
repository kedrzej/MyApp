package Bakery;

import java.time.LocalTime;
import java.util.Scanner;

public class Bakery {
    public static void main(String[] args) {

        System.out.println("Witaj w naszej piekarni!");
        LocalTime userTime = LocalTime.now();
        int currentHour = userTime.getHour();
        int openingHour = 9;
        int closingHour = 21;

        if (currentHour < openingHour) {
            System.out.println("Jesteś za wcześnie. Piekarnia otwiera się o 9.");
        } else if (currentHour >= closingHour) {
            System.out.println("Przyszedłeś za późno. Piekarnia zamyka się o 21.");
        } else {
            System.out.println("Piekarnia jest otwarta. Zapraszamy!");
            chooseProducts();
        }
    }

    private static void chooseProducts() {
        String[] availableProductsInTheShop = {"1. Chleb, 2. Ciasto, 3. Ciasteczka, 4. Tort, 5. Rogaliki"};


        int userChoice;
        int finalPrize = 0;

        int breadPrize = 5;
        int piePrize = 10;
        int cookiesPrize = 7;
        int cakePrize = 15;
        int crossaintsPrize = 12;

        do {
            System.out.println("Wybierz numer produktu, który chciałbyś kupić. Wybierz \"0\" aby zakończyć zakupy.");
            for (String product : availableProductsInTheShop) {
                System.out.println(product);
            }
            Scanner scanner = new Scanner(System.in);
            userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.println("Cena chleba to 5zł.");
                    finalPrize += breadPrize;
                    break;
                case 2:
                    System.out.println("Cena ciasta to 10zł.");
                    finalPrize += piePrize;
                    break;
                case 3:
                    System.out.println("Cena ciasteczek to 7zł.");
                    finalPrize += cookiesPrize;
                    break;
                case 4:
                    System.out.println("Cena tortu to 15zł");
                    finalPrize += cakePrize;
                    break;
                case 5:
                    System.out.println("Cena rogalików to 12zł.");
                    finalPrize += crossaintsPrize;
                    break;
            }
        } while (userChoice != 0);

            System.out.println("Dziękujemy za zakupy! Łączna cena Twoich produktów wynosi " + finalPrize + "zł.");

        }
    }
