public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(5678));
    }
    // write your code here
    public static int getEvenDigitSum(int number){
        int evenDigit;
        int sum=0;
        if(number<0){
            return -1;
        }
        while(number!=0){
            evenDigit=number%10;
            number=number/10;
            if(evenDigit%2==0){
                sum+=evenDigit;

            }
        }
        return sum;
    }
}