import java.lang.reflect.Array;
import java.util.Arrays;

public class RefValTypes {
    public static void main(String[] args) {

        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntVAlue = "+ myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        myIntValue++;
        System.out.println("anotherIntValue = "+ anotherIntValue);


        int[] myArray = new int[5];
        int[] anotherArray = myArray;
        anotherArray[2]++;
        System.out.println("myArray = "+ Arrays.toString(myArray));
        System.out.println("Another Array = " + anotherArray[2]);

        modifyArray(myArray);

        System.out.println("myArray = "+ Arrays.toString(myArray));

        int[] numArray = {6,3,8,7,0,1};
    }

    public static void modifyArray(int[] array){
        array[0] = 2;
    }

}
