public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double s = 1_000_000;
        double y = 3;
        double p = 9.99;
        double pay = service.calculate(s, y, p);
        System.out.println("Ежемесячный платеж " + pay);

    }
}
