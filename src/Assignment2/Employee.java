package Assignment2;

class Employee {
    public static int base = 18000;
    int salary()
    {
        return base;
    }
}

class Manager extends Employee {
    int in = 20000;
    int salary()
    {
        int i = base + in;
        return i;
    }
}


class Labour extends Employee {

    int salary()
    {
        int ot = 5000;
        int j = base + ot;
        return j;
    }
}

// Driver clas
class Main {

    static void printSalary(Employee e)
    {
        System.out.println(e.salary());
    }

    public static void main(String[] args)
    {

        Employee obj1 = new Manager();
        System.out.print("Manager's salary : ");
        printSalary(obj1);

        Employee obj2 = new Labour();
        System.out.print("Labour's salary : " );
        printSalary(obj2);
    }
}