package IO.Slide2;

import java.io.*;

public class DemoSlide2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        writeUsingFileOutputStream();

        readUsingFileInputStream();

    }

    private static void writeUsingFileOutputStream() throws IOException {
        //create object to serialize(save)
        Person person = new Person("Alex","Vasile");

        File file = new File("C:\\Users\\Andrei\\IdeaProjects\\Java Advanced 5\\output stream.txt");

        //serialize object
        try (FileOutputStream fileOutputStream = new FileOutputStream(file)){
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(person);
        }
    }

    public static void readUsingFileInputStream() throws IOException, ClassNotFoundException {
        File source = new File("C:\\Users\\Andrei\\IdeaProjects\\Java Advanced 5\\output stream.txt");

        Person person;
        //read with input stream
        try(FileInputStream filterInputStream = new FileInputStream(source)){
            ObjectInputStream objectInputStream = new ObjectInputStream(filterInputStream);

            //cast object read result to a Person object
            person = (Person) objectInputStream.readObject();
            System.out.println(person);
        }
    }
}
