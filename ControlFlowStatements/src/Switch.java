public class Switch {
    public static void main(String[] args) {
        String switchValue="January";
        switch(switchValue.toLowerCase()){
            case "january":
                System.out.println("January is the first month of the year");
                break;

            case "february":
                System.out.println("February is the second month of the year");
                break;


            default:
                System.out.println("not found");
        }
    }
}
