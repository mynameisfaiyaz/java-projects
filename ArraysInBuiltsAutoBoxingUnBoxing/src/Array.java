public class Array {

    public static void main(String[] args) {

        int[] myArray = new int[10];
        myArray[0] = 45;
        myArray[1] = 12;
        myArray[2] = 37;

        System.out.println(myArray[1]);

        int myNewArray[] = {1,42,23,48};
        System.out.println(myNewArray);//prints only the address
        System.out.println(myNewArray[1]);//prints only the element at position

        char[] charArray = {'F','a','i','y','a','z'};
        for(int i =0; i<=5; i++){
            System.out.println(charArray[i]);
        }

        int sum[] = {0};
        for(int j = 0; j<=4; j++){
            sum[j] += myArray[j];
            System.out.println("Sum : " + sum[j]);
        }

    }


}
