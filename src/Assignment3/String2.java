package Assignment3;

public class String2
{
    public static void main(String args[])
    {
        StringBuilder s1 = new StringBuilder("Hello,");
        StringBuilder s2 = new StringBuilder(" How are you?");
        StringBuilder s = s1.append(s2);
        System.out.println(s.toString());
    }
}