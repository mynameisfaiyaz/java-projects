public class NumToWords {
    public static void main(String[] args) {
        numToWords(1234);
    }
    public static void numToWords(int number){
        if(number<0){
            System.out.println( "Invalid Value");
        }
        while(number!=0){
            int num=number%10;
            switch(num){
                case 1:
                    System.out.println("one");
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
            }
            number=number/10;

        }
    }

}
