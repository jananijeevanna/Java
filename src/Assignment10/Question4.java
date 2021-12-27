package Assignment10;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Question4
{
    public static void main(String[] args)
    {
        Path filePath = Paths.get("C:/", "Test file", "StudentList.txt");

        try
        {
            String content = Files.readString(filePath);

            System.out.println(content);

            List<String> lines = content.lines()
                    .filter(line -> !line.isBlank())
                    .map(String::strip)
                    .collect(Collectors.toList());

            System.out.println("names of the students: "+ lines);
            System.out.println("Total number of students: "+ lines.size());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
