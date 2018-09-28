public class variable {
    public static void main (String args[]){
        // integer has a width of 32 (2^32 = 4294967296)
        int minVal = -2147483648;//minimum value of integer java can hold
        int maxVal = 214748647;//maximum value of integer java can hold

        //byte has a width of 8 (2^8 = 256)
        byte minByte = -128;//minimum value of byte
        byte maxByte = 127;

        byte newByte = (byte)(minByte/2);//java treats number as an integer by default
        //so if try to divide byte by an integer it will cause an error
        //to fix this we use typecasting put the dataType into the parenthesis
        //same problem with short and long
        System.out.println(newByte );

        //short has a width of 16 (2^16 = 65536)
        short minShort = -32768;//minimum short value
        short maxShort = 32767;//maximum short value

        long minLong = -9223372036854775808L;//use l or L declare that it is long data type
        long maxLong = 9223372036854775807L;//use l or L declare that it is long data type


        System.out.println(maxVal-minVal);
    }
}
