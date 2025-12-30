import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandlingExample {
    public static void main(String[] args) throws Exception {

        File file = new File("sample.txt");

        if (file.createNewFile()) {
            System.out.println("File created");
        } else {
            System.out.println("File already exists");
        }

        FileWriter writer = new FileWriter(file);
        writer.write("Welcome to Java File Handling");
        writer.write("\nThis file is created, written, and read using Java");
        writer.close();

        Scanner reader = new Scanner(file);
        while (reader.hasNextLine()) {
            System.out.println(reader.nextLine());
        }
        reader.close();

        if (file.delete()) {
            System.out.println("File deleted");
        } else {
            System.out.println("Failed to delete file");
        }
    }
}
 