package IO.IOJava8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class DemoIOJava8 {
    public static void main(String[] args) {
        try {
            readFileWithJava8();
        } catch (IOException e) {
            System.out.println("Complex Error");
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

    private static void writeFileWithJava8() {

    }

}
