import java.util.Arrays;

public class ReverseArrayChallenge {

    public static void main(String[] args) {
        int[] array  = {1,2,3,4,5};
        System.out.println("Array : " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reverse Array : " + Arrays.toString(array));

    }

    public static void reverse(int[] array){
        int maxIndex = array.length-1;
        int halfLength = array.length/2;
        for(int i=0; i<halfLength; i++){
            int temp = array[i];// temp holds the value of array at location i
            array[i] = array[maxIndex-i];// place the value of last index at first index and so on...
            array[maxIndex-i] = temp;// place the value of temp at last position ,then second last position and so on...
        }
    }
}
