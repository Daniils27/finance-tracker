import java.math.BigDecimal;
import java.time.LocalDate;

public class Transaction {
    private long id;
    private BigDecimal amount;
    private TransactionType type;
    private String category;
    private String description;
    private LocalDate date;

        public Transaction(long id, BigDecimal amount, TransactionType type, String category, String description, LocalDate date){
            if (amount.compareTo(BigDecimal.ZERO) <= 0) {
                throw new IllegalArgumentException("Amount must be positive");
            }
            this.id = id;
            this.amount = amount;
            this.type = type;
            this.category = category;
            this.description = description;
            this.date = date;
        }
    public BigDecimal getAmount() {
            return amount;
        }
    public long getId(){
            return id;
    }
    public TransactionType getType(){
            return type;
    }
    public String getCategory(){
            return category;
    }
    public String getDescription() {
        return description;
    }
    public LocalDate getDate() {
        return date;
    }
    public String toString() {
        return date + " | " + type + " | " + category + " | " + amount + " | " + description;
    }
}
