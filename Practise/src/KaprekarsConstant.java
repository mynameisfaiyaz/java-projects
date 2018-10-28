import java.util.Arrays;
import java.util.Scanner;

public class KaprekarsConstant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(Kaprekar(num));
    }

    public static int Kaprekar(int num){

        if (num == 6174) {
            return 0;
        }
        // initialize an array with single digits of the given number
        int[] numArray = {num / 1000, num % 1000 / 100, num % 1000 % 100 / 10, num % 1000 % 100 % 10};
        int ascNum = 0;
        int desNum = 0;
        Arrays.sort(numArray); // sort the array of given number
        for (int i = 0; i < 4; i++) {
            desNum += (numArray[i] * (int)Math.pow(10, i)); // sort number in descending order by adding smallest number to last place and so on
            ascNum += (numArray[i] * (int)Math.pow(10, 3 - i)); // sort number in ascending order by adding smallest number to first place and so on
        }
        return 1 + Kaprekar(desNum - ascNum); //  function call is performed until difference is 6174 and return Kaplekar's constant
    }
}
