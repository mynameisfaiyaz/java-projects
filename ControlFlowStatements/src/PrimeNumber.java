public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println(primeNumberTest(1));

    }
    //A prime number is a whole number greater than 1 whose only factors are 1 and itself.
    public static boolean primeNumberTest(int num){
        if (num == 1){
            return false;
        }
        for(int i=2;i<=num/2;i++){//No number is divisible by more than half of itself
            if(num%i==0){//divide num in range 2 to num/2
                return false;
            }

        }
        return true;
    }
}
