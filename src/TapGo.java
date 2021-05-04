public class TapGo {

    int Payments ;
    int myBalance ;
    int threshold;
   TapGo(int balance,int threshold){
    this.threshold=threshold;
//    this.Payments = payment;
    this.myBalance = balance;
}


    public void paymentCard(int payAmount) {
        this.Payments = payAmount;
        try {

            if (payAmount > myBalance) {
                System.out.println("You are Broke!!");

            }

            else  if(payAmount>threshold){
                throw new Exception();
            }
            else {
                myBalance -= Payments;
                System.out.println("Succesful Your Balance is : " + myBalance);

            }
        } catch (Exception e){
            System.out.println("You Have reached your limit");


        }
    }
    public void deposit(int cash) {
        this.myBalance += cash;

    }

    public int getBalance() {
    return myBalance;
//        System.out.println("New Balance :"+ newBalance);
        }

        }


