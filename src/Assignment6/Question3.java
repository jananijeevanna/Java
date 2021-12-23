package Assignment6;
import java.util.Collection;
import java.util.*;

public class Question3 {

    public static void main(String[] args) {

        Employee2 e1 = new Employee2(456, "Lisa", "Civil", 40000);
        Employee2 e2 = new Employee2(457, "Mohan", "Civil", 30000);
        Employee2 e3 = new Employee2(458, "John", "IT", 50000);
        Employee2 e4 = new Employee2(459, "Linda", "Operations", 40000);
        Employee2 e5 = new Employee2(460, "Maddy", "Civil", 70000);
        Employee2 e6 = new Employee2(461, "Victor", "IT", 30000);
        Employee2 e7 = new Employee2(462, "Andrea", "IT", 90000);
        Employee2 e8 = new Employee2(463, "Rose", "Civil", 15000);
        Employee2 e9 = new Employee2(464, "Ram", "Operations", 75000);
        Employee2 e10 = new Employee2(465, "Jerome", "Civil", 45000);

        Set<Object> employeeSet = new TreeSet<>();
        employeeSet.add(e1);
        employeeSet.add(e2);
        employeeSet.add(e3);
        employeeSet.add(e4);
        employeeSet.add(e5);
        employeeSet.add(e6);
        employeeSet.add(e7);
        employeeSet.add(e8);
        employeeSet.add(e9);
        employeeSet.add(e10);

        Scanner sc = new Scanner(System.in);

        System.out.println(" Select one option to print Employee details ");
        System.out.println("\n a) ID \n b) Name \n c) Department \n d) Salary");

        String s = sc.next();

        /*if (s.equals("a"))
        {

        }*/
        Iterator<Object> i= employeeSet.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
