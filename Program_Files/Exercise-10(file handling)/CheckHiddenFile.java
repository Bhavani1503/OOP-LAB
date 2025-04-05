import java.io.File;

public class CheckHiddenFile {
    public static void main(String[] args) {
        File file = new File("test.txt");
        if (file.isHidden()) {
            System.out.println("The file is hidden.");
        } else {
            System.out.println("The file is not hidden.");
        }
    }
}
