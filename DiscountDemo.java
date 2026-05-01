@FunctionalInterface
interface DiscountCalculator {

    // TODO 1
    double calculate(double price);
}

public class DiscountDemo {
    public static void main(String[] args) {

        // TODO 2
        DiscountCalculator discount10 = price -> price * 0.9;

        // TODO 3
        DiscountCalculator discount25 = price -> price * 0.75;

        double price = 100;

        // TODO 4
        System.out.println("Price after 10% discount: " + discount10.calculate(price));

        // TODO 5
        System.out.println("Price after 25% discount: " + discount25.calculate(price));
    }
}
