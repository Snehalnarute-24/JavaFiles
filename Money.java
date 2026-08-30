public class Money {
    private final long paise;
    private final String currency;

    public Money(long paise, String currency) {
        if (paise < 0) {
            throw new IllegalArgumentException(
                "Money cannot be negative, update it"
            );
        }

        if (currency == null || currency.isEmpty()) {
            throw new IllegalArgumentException(
                "Currency cannot be null or empty, update it"
            );
        }

        this.paise = paise;
        this.currency = currency;
    }

    public static Money rupees(long r) {
        return new Money(r * 100, "INR");
    }

    public Money plus(Money s) {
        return new Money(this.paise + s.paise, this.currency);
    }

    public static void main(String[] args) {
        Money savings = new Money(5000, "INR");
        Money current = Money.rupees(50);

        Money total = savings.plus(current);

        System.out.println(total.paise + total.currency);
    }
}