package Assignment6;

import java.util.*;

public class Question2 {

    public static void main(String[] args) {

        Contact c1 = new Contact(7865432456l,"John", "john@gmail.com", Gender.FEMALE);
        Contact c2 = new Contact(8796543789l,"Mad", "maddy@gmail.com", Gender.MALE);
        Contact c3 = new Contact(2736498762l,"Peter", "peter@gmail.com",  Gender.MALE);
        Contact c4 = new Contact(9800432456l,"Sydney", "sydney@gmail.com", Gender.FEMALE);
        Contact c5 = new Contact(2836432456l,"Jose", "jose@gmail.com", Gender.FEMALE);

        Set<Object> contactSet = new HashSet<>();
        contactSet.add(c1);
        contactSet.add(c2);
        contactSet.add(c3);
        contactSet.add(c4);
        contactSet.add(c5);
        contactSet.add(c2); /*duplicate element*/

        Iterator<Object> i= contactSet.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
