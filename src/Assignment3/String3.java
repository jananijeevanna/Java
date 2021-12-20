package Assignment3;

import java.util.Locale;

public class String3 {

    public static void main(String args[]) {

        String str = "Java String pool refers to collection of Strings which are stored in heap memory";

        String strLower = str.toLowerCase();
        System.out.println("Lower case : "+strLower);

        String strUpper = str.toUpperCase();
        System.out.println("Upper case : "+strUpper);

        String replaceString=str.replace('a','$');
        System.out.println("Replaced a with $ : " +replaceString);

        System.out.println("Contains word 'collection': " + str.contains("collection"));

        String str2 = "java string pool refers to collection of strings which are stored in heap memory";
        System.out.println("Comparing " + str + " and " + str2
                + " : " + str.equals(str2));

        System.out.println("Comparing " + str + " and " + str2
                + " : " + str.equalsIgnoreCase(str2));


    }
}