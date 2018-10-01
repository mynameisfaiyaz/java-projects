public class For {
    public static void main(String[] args) {

        for (int i=2;i<=8;i++){
            double interestRate = calculateInterestRate(1000,i);
            System.out.println("1000 at"+i+"% interest = "+String.format("%.2f",interestRate));
        }// string format shows decimal up  to two places
        calculateInterestRate(1000,5);
    }
    public static double calculateInterestRate(double amount, double interestRate){
        return amount*(interestRate/100);
    }
}
