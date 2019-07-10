package IO.Exercitiu1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class DemoExercitiu1 {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("simplefile.txt");
        System.out.println(countWordsJava8(source));

//        long result = countWordsJava8(source);
//        System.out.println(result);
        countWordsJava7(source);
    }

    private static long countWordsJava8(Path path) {
        long count = 0;
        //read lines from path
        try {
            Stream<String> lines = Files.lines(path);

            //line1: word 1, word 2, word 3
            count = lines.flatMap(line -> Arrays.stream(line.trim().split(" "))).count();


        } catch (IOException e) {
            System.out.println("Could not read file!");
        }

        return count;
    }

    private static void countWordsJava7(Path path) throws IOException {

        //TODO: implement usingg Java 7
        FileReader fileReader = new FileReader("C:\\Users\\Andrei\\IdeaProjects\\Java Advanced 5\\simplefile.txt");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileReader))) {
            //read line by line
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                long count = 0;
                String[] a = line.split(" ");
                for (int i = 0; i < a.length; i++) {
                    if (a[i].length() > 0) {
                        count++;
                    }
                    line = bufferedReader.readLine();
                    System.out.println("Total number of words: " + count);
                    bufferedReader.close();
                }
            }
        }
    }
}
