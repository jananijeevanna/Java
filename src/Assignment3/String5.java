package Assignment3;

public class String5 {
    public static void main(String[] args) {
        String str = "It is used to at the specified index";
        String newSub = " insert text";
        int index = 12;
        System.out.println("Initial String = " + str);
        System.out.println("Index where new string will be inserted = " + index);
        StringBuffer resString = new StringBuffer(str);
        resString.insert(index + 1, newSub);
        System.out.println("Resultant String = "+resString.toString());
    }
}
