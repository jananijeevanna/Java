package Assignment7;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface Test {

    String model() default "Nokia";
    int version() default 1;

}


public class Mobile
    {
        int size;

        public Mobile(int size) {
            this.size = size;
        }

        @Test(model ="LG", version = 2)
        public void testMethod(){

        }
    }


class Annotation{
    public static void main(String[] args) {
        Mobile mobile = new Mobile(5);

        Method c = mobile.getClass().getMethods()[0];
        java.lang.annotation.Annotation an = c.getAnnotation(Test.class);
        Test test = (Test) an;
        System.out.println(test.model());
    }
}