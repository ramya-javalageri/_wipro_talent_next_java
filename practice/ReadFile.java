
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
    try {
        FileReader file = new FileReader("filename.txt");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            String data = sc.nextLine();
            System.out.println(data);
        }
        sc.close();
    } catch (FileNotFoundException e) {
        System.out.println("File Not Found : ");
        e.printStackTrace();
    }
    }
}