package Assignment6;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Question1 {

    public static void main(String[] args) {

        Contact c1 = new Contact(7865432456l,"John", "john@gmail.com", Gender.FEMALE);
        Contact c2 = new Contact(8796543789l,"Mad", "maddy@gmail.com", Gender.MALE);
        Contact c3 = new Contact(2736498762l,"Peter", "peter@gmail.com",  Gender.MALE);
        Contact c4 = new Contact(9800432456l,"Sydney", "sydney@gmail.com", Gender.FEMALE);
        Contact c5 = new Contact(2836432456l,"Jose", "jose@gmail.com", Gender.FEMALE);

        Map<Long,Contact> contactMap = new TreeMap<>(Collections.reverseOrder());
        contactMap.put(c1.phoneNumber, c1);
        contactMap.put(c2.phoneNumber, c2);
        contactMap.put(c3.phoneNumber, c3);
        contactMap.put(c4.phoneNumber, c4);
        contactMap.put(c5.phoneNumber,c5);

        System.out.println("Printing the keys");
        for (long key: contactMap.keySet()) {
            System.out.println(key);
        }
        System.out.println("Printing the values");
        for (long key: contactMap.keySet()) {
            System.out.println(contactMap.get(key));
        }


        for(Map.Entry<Long,Contact> entry : contactMap.entrySet()) {
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }

    }
}
