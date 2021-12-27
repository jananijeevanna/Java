package Assignment10;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Question5 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        priceApp();

    }

    private static void priceApp() throws IOException {
        System.out.println(" Select your option: (1.Insert New Price,2.View Purchases 3.Exit");

        int option2 = sc.nextInt();
        int option = option2;
        String filePath = "src/resources/FileWriterTest.txt";
        if (option == 1) {
            for (int i = 1; i < 10; i++) {

                System.out.println("Enter " + i + " item price");
                Integer enteredPrice = sc.nextInt();
                try (FileWriter fileWriter = new FileWriter(filePath, true)) {
                    fileWriter.write(enteredPrice.toString()+"\n");
                    System.out.println("price has been saved successfully");
                    System.out.println(" Do you wish to add more items?(Yes/No)");
                    String enterdoption = sc.next();
                    if (enterdoption.equalsIgnoreCase("No")) {
                        break;
                    } else if (enterdoption.equalsIgnoreCase("Yes")) {
                        continue;
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }


            }

            priceApp();

        } else if (option == 2) {
            String content = Files.readString(Path.of(filePath));
            int sum = content.lines().map(Integer::valueOf).mapToInt(Integer::intValue).sum();
            System.out.println("Total price of all items is: " + sum);
            System.out.println(" Select your option: (1.Insert New Price,2.View Purchases 3.Exit");

            priceApp();

        } else {
            System.exit(0);
        }
    }

}
