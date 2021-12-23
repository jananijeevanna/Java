package Assignment6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

public class Question4 {

    public static void main(String[] args) {
        LinkedList<String> dateList = new LinkedList<>();
        dateList.add("2000-12-12");
        dateList.add("1984-10-09");
        dateList.add("2013-12-12");
        dateList.add("2020-12-12");
        dateList.add("1995-12-12");

        for (String date : dateList) {
            LocalDate dateObj = LocalDate.parse(date);
            String isLeapYearString = dateObj.isLeapYear() ? " and it was a leap year." : " and it was not a leap year.";
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-YYYY");
            String formattedDate = dateObj.format(dateFormatter);

            System.out.println("Your Date of Birth is "
                    + formattedDate + isLeapYearString);

            
        }
    }
}
