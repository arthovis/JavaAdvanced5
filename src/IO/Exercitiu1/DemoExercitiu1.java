package IO.Exercitiu1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class DemoExercitiu1 {
    public static void main(String[] args) {
        Path source = Paths.get("simplefile.txt");
        System.out.println(countWordsJava8(source));

//        long result = countWordsJava8(source);
//        System.out.println(result);

    }

    private static long countWordsJava8(Path path){
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

    private static long countWordsJava7(Path path){
        //TODO: implement usingg Java 7
        return 0;
    }
}
