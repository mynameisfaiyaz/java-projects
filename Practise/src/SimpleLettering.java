import java.util.Scanner;

public class SimpleLettering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        System.out.println(Letter(string));
    }

    public static boolean Letter(String string){

        for( int i = 0; i < string.length(); i++ ) {
            if( Character.isLetter(string.charAt(i)) && i == 0 ) return false;
            if( Character.isLetter(string.charAt(i)) && i == string.length() - 1 ) return false;
            if( Character.isLetter(string.charAt(i)) ) {
                if( ( string.charAt(i-1) == '+' ) && ( string.charAt(i+1) == '+' ) )
                    continue;
                else return false;
            }
        }

        return true;
    }
}
