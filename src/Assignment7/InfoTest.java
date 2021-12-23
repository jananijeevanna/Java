package Assignment7;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.sql.Time;
import java.util.Date;


@Target(METHOD)
@Retention(RUNTIME)

@interface Info
{

}


public class InfoTest{


    @Info
    public void authorId(int auth_id)
    {
        System.out.println("AuthorID :"+auth_id);
    }


    @Info
    public void author(String author) {
        System.out.println("Author :"+author);
    }


    @Info
    public void date(Date date) {
        System.out.println("Date :"+date);
    }

    @Info
    public void time(Time time) {
        System.out.println("Time :"+time);
    }

    @Info
    public void version(double version) {
        System.out.println("Version :"+version);
    }



    public static void main(String[] args) {


        InfoTest infoTest =new InfoTest();
        infoTest.authorId(123);
        infoTest.author("John");
        infoTest.date(new java.util.Date());
        infoTest.time(new java.sql.Time(0));
        infoTest.version(11);
    }
}
