public class Strings {
    public static void main(String[] args) {

        // string is under double quotes

        String myString ="This is my string";
        System.out.println(myString);

        //we can concatenate string
        String newString = " New string will get added";
        System.out.println(myString+newString);

        //string can have anything inside it for eg. numbers, characters, alphanumerals, unicode
         String example = "A12&";
        System.out.println(example);


        //here we are trying to add string and integer
        // java is smart enough to understand that
        // java is simply concatenating string and integer
        String number = "45";
        int num= 3;
        System.out.println(number+num);


        // however we can add string and integer by using Integer.parseInt()  to convert string into integer
        // we can only convert string into integer if string contains only numbers
        int sum = num + Integer.parseInt(number);
        System.out.println(sum);

    }
}
