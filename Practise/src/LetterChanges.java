// replace every letter by its following letter
//for every vowel, Capitalize the letter


import java.util.Scanner;

public class LetterChanges {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(letterChanges(str));
    }

    public static String letterChanges(String str) {

        String alt = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.toString(str.charAt(i)).matches("[a-zA-Z]")) {
                if (Character.toString((char) (str.charAt(i) + 1)).matches("[aeiou]")) {
                    alt += Character.toString((char) (str.charAt(i) + 1)).toUpperCase();
                } else {
                    alt += Character.toString((char) (str.charAt(i) + 1));
                }
            } else {
                alt += str.charAt(i);
            }
        }
        return alt;
    }
}
