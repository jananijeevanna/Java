package Assignment3;

public class String7 {

    public static void main(String args[])
    {
        StringBuilder s1 = new StringBuilder("StringBuffer ");
        StringBuilder s2 = new StringBuilder("is a peer class of String ");
        StringBuilder s3 = new StringBuilder("that provides much of ");
        StringBuilder s4 = new StringBuilder("the functionality of Strings");
        StringBuilder s = s1.append(s2).append(s3).append(s4);
        System.out.println(s.toString());
    }
}
