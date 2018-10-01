public class Test {
    public static void main(String[] args) {
        System.out.println(someThing(5));
    }
    public static int someThing(int num){
        switch (num){
            case 1:
                return 1;
                //break;
                // if we switch statement inside of method which has return type (not void)
                // then we can't use break
                // and if we use void as return type we can't use return
                default:
                    return -1;
        }
    }
}
