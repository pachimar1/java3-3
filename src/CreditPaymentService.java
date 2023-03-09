import static java.lang.Math.pow;

public class CreditPaymentService {


    public double calculate(double credit, double year, double percent) {
        double percentMonth = percent / 100 / 12; // Ставка в месяц
        double pay = credit * ((percentMonth * Math.pow((1 + percentMonth), 12 * year)) / (Math.pow((1 + percentMonth), 12 * year) - 1));
        return (int) pay;
    }
}
