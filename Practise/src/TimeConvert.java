import java.util.Scanner;

public class TimeConvert {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputTime = scanner.nextInt();
        System.out.println(TimeFormatting(inputTime));
    }

    public static String TimeFormatting(int inputTime){
        int hour = inputTime/60;
        int min = inputTime%60;
        return hour+":"+min;

    }
}
