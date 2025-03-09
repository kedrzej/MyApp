package pl.yedrzey.bakery;

import java.time.LocalTime;
import java.util.Scanner;

public class Bakery {
    public static void main(String[] args) {

        System.out.println("Witaj w naszej piekarni!");

        Bakery bakery = new Bakery();
        LocalTime userTime = LocalTime.now();
        int currentHour = userTime.getHour();
        final int OPENING_HOUR = 9;
        final int CLOSING_HOUR = 21;

        if (currentHour < OPENING_HOUR) {
            System.out.println("Jesteś za wcześnie. Piekarnia otwiera się o 9.");
        } else if (currentHour >= CLOSING_HOUR) {
            System.out.println("Przyszedłeś za późno. Piekarnia zamyka się o 21.");
        } else {
            System.out.println("Piekarnia jest otwarta. Zapraszamy!");
            bakery.chooseProducts();
        }
    }

    public void chooseProducts() {
        enum Product {CHLEB, CIASTO, CIASTECZKA, TORT, ROGALIKI}

        Scanner scanner = new Scanner(System.in);
        String userChoice;
        int finalPrize = 0;

        int breadPrize = 5;
        int piePrize = 10;
        int cookiesPrize = 7;
        int cakePrize = 15;
        int crossaintsPrize = 12;

        do {
            System.out.println("Wpisz nazwę produktu, który chciałbyś kupić. Wpisz \"KONIEC\" aby zakończyć zakupy.");
            System.out.println("Dostępne produkty: ");
            for (Product product : Product.values()) {
                System.out.println(product.name());
            }

            userChoice = scanner.nextLine().toUpperCase();

            if (!userChoice.equals("KONIEC")) {

                Product chosenProduct = Product.valueOf(userChoice);

                switch (chosenProduct) {
                    case CHLEB:
                        System.out.println("Cena chleba to 5zł.");
                        finalPrize += breadPrize;
                        break;
                    case CIASTO:
                        System.out.println("Cena ciasta to 10zł.");
                        finalPrize += piePrize;
                        break;
                    case CIASTECZKA:
                        System.out.println("Cena ciasteczek to 7zł.");
                        finalPrize += cookiesPrize;
                        break;
                    case TORT:
                        System.out.println("Cena tortu to 15zł");
                        finalPrize += cakePrize;
                        break;
                    case ROGALIKI:
                        System.out.println("Cena rogalików to 12zł.");
                        finalPrize += crossaintsPrize;
                        break;
                }
            }
        }
        while (!userChoice.equals("KONIEC")) ;

        System.out.println("Dziękujemy za zakupy! Łączna cena Twoich produktów wynosi " + finalPrize + "zł.");
    }

}
