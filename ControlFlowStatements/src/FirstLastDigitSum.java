public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));
    }
        public static int sumFirstAndLastDigit(int number){
            if(number<0){
                return -1;
            }
            int lastDigit = number%10;
            int firstDigit=number;
            while(number!=0){
                firstDigit=number%10;
                number=number/10;
            }
            return firstDigit+lastDigit;
        }
}
