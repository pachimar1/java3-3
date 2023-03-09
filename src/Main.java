public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double credit = 1_000_000;
        double year = 2;
        double percentYear = 9.99;
        double pay = service.calculate(credit, year, percentYear);
        System.out.println("Ежемесячный платеж " + pay);

    }
}
