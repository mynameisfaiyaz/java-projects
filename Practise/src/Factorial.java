import java.util.*;
import java.io.*;

class Factorial {
    public static int Factorial(int num) {

        int fact=1;
        for(int i=1; i<=num; i++){
            fact = fact*i;
        }
        // code goes here
    /* Note: In Java the return type of a function and the
       parameter types being passed are defined, so this return
       call must match the return type of the function.
       You are free to modify the return type. */

        return fact;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(Factorial(s.nextInt()));
    }

}