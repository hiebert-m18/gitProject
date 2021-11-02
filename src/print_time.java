import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class print_time {
    public static void main(String[] args) {
        // added comments
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }
}
