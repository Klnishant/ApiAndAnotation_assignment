import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023,05,22);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = date.format(formatter);
        System.out.println("Formatted date:"+formattedDate);
    }
}
