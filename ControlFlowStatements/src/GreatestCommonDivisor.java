public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25,15));
    }

    public static int getGreatestCommonDivisor(int first,int second){
       while (first!=second){
           if(first>second){
               first-=second;
               continue;
           }
           else {
               second-=first;
               continue;
           }
       }
       return first;
    }
}
