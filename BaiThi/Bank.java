package BaiThi;

public class Bank {
    private double balance, rate;
    private double interest;



    public Bank(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }
    public double calculateInterest(){
        return  balance * (rate / 1200);
    }



    @Override
    public String toString() {
        return "Bank{" +
                "balance=" + balance +
                ", rate=" + rate +
                '}';
    }
}
