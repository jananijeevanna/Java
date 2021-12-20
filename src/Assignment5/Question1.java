package Assignment5;

import java.util.HashSet;

class Employee {

    int id;
    String name;
    int salary;
    String dept;

    public Employee(int id, String name, int salary, String dept) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    public void displayDetails()
    {

    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                '}';
    }
}

public class Question1 {

    public static void main(String[] args) {

        HashSet<Employee> hs = new HashSet<>();
        Employee employee1 = new Employee(1,"John",60000, "Civil");
        hs.add(employee1);
        Employee employee2 = new Employee(2,"Peter",40000, "Electrical");
        hs.add(employee2);
        System.out.println(hs);

    }
}
