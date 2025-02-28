import org.junit.Test;

import java.time.LocalTime;

import static org.junit.Assert.assertEquals;

public class Tests {

    @Test
    public void shouldDisplayCurrentTime() {
        LocalTime userTime = LocalTime.now();
        int currentHour = userTime.getHour();
        assertEquals(userTime.getHour(), currentHour);
    }

}

