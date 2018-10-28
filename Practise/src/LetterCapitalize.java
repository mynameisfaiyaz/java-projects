import java.util.Scanner;

public class LetterCapitalize {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(Capitalize(string));
    }

    public static  String Capitalize (String string){

        String[] words = string.split(" "); // separate each words (using space)
        for (int i = 0; i < words.length; i++) {
            char firstChar = Character.toUpperCase(words[i].charAt(0)); // capitalize first letter of each words
            words[i] = firstChar + words[i].substring(1); // add first character  and remaining letters
        }
        return String.join(" ", words); // join all string array
    }
}
