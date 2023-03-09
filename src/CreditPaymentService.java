import static java.lang.Math.pow;

public class CreditPaymentService {


    public double calculate(double s, double y, double p) {
        double p1 = p / 100 / 12; // Ставка в месяц
        double m1 = s * ((p1 * Math.pow((1 + p1), 12 * y)) / (Math.pow((1 + p1), 12 * y) - 1));
        return (int) m1;
    }
}
