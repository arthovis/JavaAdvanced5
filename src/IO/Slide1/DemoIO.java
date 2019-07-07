package IO.Slide1;

import java.io.*;

public class DemoIO {
    public static void main(String[] args) throws IOException {
        readWithBufferedReader();

        writeWithBufferedWriter();

        writeWithBufferedWriterAppend();

    }

    private static void readWithBufferedReader() throws IOException {
        //read file using BufferedReader
        File file = new File("C:\\Users\\Andrei\\IdeaProjects\\Java Advanced 5\\simplefile.txt");
        //create buffered reader
        //try with resource
        //try(resource to be handeled)()
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            //read line by line
            String fileLine;
            while ((fileLine = bufferedReader.readLine())!=null){
                System.out.println(fileLine);
            }
        }
    }

    private static void writeWithBufferedWriter() throws IOException {
        //file destination
        File destination = new File("C:\\Users\\Andrei\\IdeaProjects\\Java Advanced 5\\output-file.txt");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destination))){
            String line = "Asta e textul meu.";
            bufferedWriter.write(line);
            System.out.println(line);
        }
    }

    private static void writeWithBufferedWriterAppend() throws IOException {
        //file destination
        File destination = new File("C:\\Users\\Andrei\\IdeaProjects\\Java Advanced 5\\output-file.txt");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destination, true))){
            String line = "\nAppended Text.";
            bufferedWriter.write(line);
            System.out.print(line);
        }
    }
}
