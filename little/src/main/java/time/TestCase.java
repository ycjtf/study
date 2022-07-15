package time;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestCase {

    @Test
    public void t0() {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalDateTime localDateTime = localDate.atStartOfDay();
        System.out.println(localDateTime);
    }
}
