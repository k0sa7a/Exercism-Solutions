import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    LocalDateTime time;

    public Gigasecond(LocalDate moment) {
        time = moment.atStartOfDay();
    }

    public Gigasecond(LocalDateTime moment) {
        time = moment;
    }

    public LocalDateTime getDateTime() {
        return this.time.plusSeconds(1000000000);
    }
}
