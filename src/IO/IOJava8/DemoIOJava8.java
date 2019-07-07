package IO.IOJava8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class DemoIOJava8 {
    public static void main(String[] args) {
        try {
            readFileWithJava8();
        } catch (IOException e) {
            System.out.println("Complex Error");
        }
        try {
            writeFileWithJava8();
        } catch (IOException e) {
            System.out.println("Could not write");
        }
    }

    private static void readFileWithJava8() throws IOException {
        Path source = Paths.get("C:\\Users\\Andrei\\IdeaProjects\\Java Advanced 5\\simplefile.txt");
        //read line by line
        List<String> lines = Files.readAllLines(source);

        //print result
        for (String line : lines) {
            System.out.println(line);
        }
    }

    private static void writeFileWithJava8() throws IOException {
        //create destination
        Path destination = Paths.get("C:\\Users\\Andrei\\IdeaProjects\\Java Advanced 5\\output Java8.txt");

        //create content
        List<String> content = Arrays.asList("Alex, Ana, Cristi");
        Files.write(destination,content);
    }

}
