package Assignment3;

public class String4 {

    public static void main(String args[])
    {
        StringBuffer s1 = new StringBuffer("StringBuffer ");
        StringBuffer s2 = new StringBuffer("is a peer class of String ");
        StringBuffer s3 = new StringBuffer("that provides much of ");
        StringBuffer s4 = new StringBuffer("the functionality of Strings");
        StringBuffer s = s1.append(s2).append(s3).append(s4);
        System.out.println(s.toString());
    }
}
