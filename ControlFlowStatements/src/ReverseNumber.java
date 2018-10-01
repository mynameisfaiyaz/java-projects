public class ReverseNumber {

    public static void main(String[] args) {
        System.out.println(reverse(1230));
    }
    public static int reverse(int number){
        int rev=0, numCheck=number;
        while(numCheck!=0){
            rev=numCheck%10+rev*10;
            numCheck=numCheck/10;

        }
        return rev;
    }

}

