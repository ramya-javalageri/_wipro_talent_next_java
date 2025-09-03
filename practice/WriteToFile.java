import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("filename.txt");
            file.write("This is the file Content...");
            file.close();
            System.out.println("Writing completed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}