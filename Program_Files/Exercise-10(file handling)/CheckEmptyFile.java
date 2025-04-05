import java.io.File;

public class CheckEmptyFile {
    public static void main(String[] args) {
        File file = new File("test.txt");
        if (file.length() == 0) {
            System.out.println("The file is empty.");
        } else {
            System.out.println("The file is not empty.");
        }
    }
}
