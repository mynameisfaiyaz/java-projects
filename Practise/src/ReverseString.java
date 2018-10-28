import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str){
        String reverseString = new String();
        for (int i = 0; i < str.length(); i++) {
            reverseString += str.charAt(str.length() - i - 1);
        }
        return reverseString;


    }



}
