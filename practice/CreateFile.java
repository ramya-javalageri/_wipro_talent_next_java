import java.io.File;
import java.io.IOException;

public class CreateFile {
  public static void main(String[] args) {
    File file = new File("filename.txt"); //Can also specify directory
    try {
        if(file.createNewFile()){
           System.out.println("File created: " + file.getName());
        }
        else{
           System.out.println("File was not created");
    }
    } catch (IOException e) {
      System.out.println("There was an error");
      e.printStackTrace();
    }
  }
}