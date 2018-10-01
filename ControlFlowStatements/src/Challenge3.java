public class Challenge3 {
    public static void main(String[] args) {
        System.out.println(sumDigits(582));
    }

    public static int sumDigits(int number){
        int sum=0;
            while (number>0 || sum>9){
                if(number==0){
                    number =sum;
                    sum=0;
                }
                sum+=number%10;
                number=number/10;
            }

    return sum;
    }
}
