import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {

    public static void main(String[] args) {
        System.out.println("Writing objects...");

        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("test.ser"));) {



           Person person = new Person(7, "Mike");
           Person.setCount(88);
           os.writeObject(person);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
          catch (IOException e) {
            e.printStackTrace();
        }
    }
}
