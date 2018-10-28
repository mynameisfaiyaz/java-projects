import java.util.Arrays;
import java.util.Scanner;

public class HelloSoup {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(Arrange(string));
    }

    public static String Arrange(String string){

        char[] chars = string.toCharArray(); // change the string to character array
        Arrays.sort(chars); // sort the characters in the array
        return new String(chars); // change the characters into String
    }
}
