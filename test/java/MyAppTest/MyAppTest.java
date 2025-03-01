package MyAppTest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyAppTest {

    @Test
    public void openingHours() {
        int currentHour = 12;
        final int OPENING_HOUR = 9;
        final int CLOSING_HOUR = 21;
        String information;
        if (currentHour < OPENING_HOUR) {
            information = "Jesteś za wcześnie. Piekarnia otwiera się o 9.";
            System.out.println("Jesteś za wcześnie. Piekarnia otwiera się o 9.");
        } else if (currentHour >= CLOSING_HOUR) {
            information = "Przyszedłeś za późno. Piekarnia zamyka się o 21.";
            System.out.println("Przyszedłeś za późno. Piekarnia zamyka się o 21.");
        } else {
            information = "Piekarnia jest otwarta. Zapraszamy!";
            System.out.println("Piekarnia jest otwarta. Zapraszamy!");
        }

        assertEquals("Piekarnia jest otwarta. Zapraszamy!", information);
    }

}

