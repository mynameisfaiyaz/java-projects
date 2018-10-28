import java.util.Scanner;

public class SimpleAdding {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(Addition(num));
    }

    public static   int Addition (int num){
        int sum =0;
        for (int i =0; i<=num; i++){
            sum+=i;
        }
return sum;
    }

}
