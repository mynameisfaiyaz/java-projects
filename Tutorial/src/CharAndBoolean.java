public class CharAndBoolean {
    public static void main(String[] args) {
        // char can have only single character
        /**
         * it can have anything :
         *  a single digit number
         *  a single character
         *  a symbol
         */
        // width of char is 16

        //use single qoute for char

        char myChar = 'A';
        char myChar1 = '1';
        char myChar2 = '$';

        // we can also use unicode print a character
        /*
        *for this we will put  inside single quote followed by unicode
        * for eg. '\u00A9'
        */
        char unicode = '\u06B7';
        System.out.println(unicode);
    }
}
