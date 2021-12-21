package Assignment2;

/*abstract class cannot be instantiated*/
/*abstract class cannot be final*/
public abstract class Animal {

    abstract void run();
}

class Cheetah extends Animal {

    @Override
    void run() {
        System.out.println(" Cheetah is running ");
    }
}

/*the class is declared as abstract without abstract method*/
 abstract class Lion extends Animal {

}
class Horse extends Animal {

    @Override
    void run() {
        System.out.println(" Horse is running ");
    }
}


class Main4{

    public static void main(String[] args) {

    Animal cheetah = new Cheetah();
    cheetah.run();
        /*overriding animal class method*/
    Animal horse = new Horse();
    horse.run();
    }

    }
