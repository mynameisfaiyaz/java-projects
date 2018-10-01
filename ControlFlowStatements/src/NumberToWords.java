public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(10);
        System.out.println(reverse(1450));
        System.out.println(getDigitCount(0));

    }
    //prints numbers into words
    public static void numberToWords(int number){
        int rev=reverse(number);
        int revCount = getDigitCount(rev);
        while(rev!=0){
            int num=rev%10;
            switch(num){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;

            }

            rev=rev/10;
        }
        if(number%10==0) {
            int digits=getDigitCount(number)-revCount;
            for (int i =0; i < digits; i++) {
                System.out.println("Zero");
            }
        }

    }
    //reverse the number
    public static int reverse(int number){
       int reverse=0, numCheck=number;
        while(numCheck!=0){
            reverse=numCheck%10+reverse*10;
            numCheck=numCheck/10;
        }
        return reverse;
    }
// count the number of digits
    public static int getDigitCount(int number){
        int count=0;
        if(number==0){
            count=1;
        }
        while(number>0){
            count++;
            number=number/10;
        }
        return count;
    }
}