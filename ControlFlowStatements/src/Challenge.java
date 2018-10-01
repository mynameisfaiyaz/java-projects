public class Challenge {
    public static void main(String[] args) {
        int count=0;
        for(int i=3;i<15;i++){
        if(testPrime(i)==true){
            System.out.println(i);
            count++;
            if(count==3){
                break;
            }
        }


    }
    }
    public static boolean testPrime(int num){
        if(num==1){
            return false;
        }
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
