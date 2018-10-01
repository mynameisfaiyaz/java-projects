public class SharedDigit {
    // write your code here
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
    }

    public static boolean hasSharedDigit(int first, int second){
        if((first<10 || first>99)||(second<10 || second>99)){
            return false;
        }
        int firstNum, secondNum;
        while(first!=0 && second!=0){
            firstNum = first%10;
            secondNum = second%10;
            if(firstNum == secondNum){
                return true;
            }
            first = first/10;
            if(secondNum==first){
                return true;
            }
            second = second/10;
            if(firstNum==second){
                return true;
            }
        }
        return false;
    }

}