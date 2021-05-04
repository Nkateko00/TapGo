public class Payments {

    public static void main(String[] args) {

        TapGo pay = new TapGo(10000,2000);
        pay.deposit(0);
        pay.paymentCard(1800);
        pay.getBalance();

        

    }
}
