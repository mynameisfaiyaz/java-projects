public class Palindrome {
    public static void main(String[] args) {

        System.out.println(isPalindrome(12321));

    }

        public static boolean isPalindrome(int number){
            int numToCheck = number;
            int reverse =0;
        while(numToCheck!=0){
                reverse=(numToCheck%10)+reverse*10;
                numToCheck=numToCheck/10;
                if(number==reverse){
                    return true;
                }
            }
            return false;

        }
    }
