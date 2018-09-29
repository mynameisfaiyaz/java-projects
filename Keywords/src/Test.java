
public class Test {

    public static void main(String[] args) {
        System.out.println(getDurationString(54, 64));
        System.out.println(getDurationString(4512L));
    }

    private static String getDurationString(long minutes, long seconds) {

        if(minutes>=60 && seconds<60){
            long hours = minutes / 60;
            long remainingMinutes = minutes % 60;
            return hours + "h " +remainingMinutes + "m " + seconds + "s";
        }
        if(minutes>=60 && seconds>=60){
            long remainingSeconds = seconds%60;
            long remainingMinutes = (minutes+seconds/60)%60;
            long hours = (minutes+seconds/60)/60;
            return hours + "h " +remainingMinutes + "m " + remainingSeconds + "s";
        }
        if(minutes<60 && seconds>60){
            long remainingSeconds = seconds%60;
            long remainingMinutes = (minutes+seconds/60)%60;
            long hours = (minutes+seconds/60)/60;
            return hours + "h " +remainingMinutes + "m " + remainingSeconds + "s";
        }
        if(minutes<60 && seconds<60){
            return  "0 h " +minutes + "m " + seconds + "s";
        }

        return "Incorrect Value";
    }

    private static String getDurationString(long seconds) {
        if(seconds < 0) {
            return "Invalid value";
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }
}
