import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Transaction t = new Transaction(
                1,
                new BigDecimal("25.50"),
                TransactionType.EXPENSE,
                "FOOD",
                "Lunch",
                LocalDate.now());
        System.out.println(t);
    }
}
