public class LastDigitChecker {
    // write your code here
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(10,60,80));
    }

    public static boolean hasSameLastDigit(int num1,int num2,int num3){
        if(num1<10||num1>1000||num2<10||num2>1000||num3<10||num3>1000){
            return false;
        }
        while(num1!=0 && num2!=0 && num3!=0){
            num1 = num1%10;
            num2 = num2%10;
            num3 = num3%10;
            if(num1==num2||num2==num3||num1==num3){
                return true;
            }
        }
        return false;
    }
}