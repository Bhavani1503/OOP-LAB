import java.nio.file.*;
import java.io.IOException;
import java.util.Arrays;

public class WriteFileNIO {
    public static void main(String[] args) {
        try {
            Files.write(Paths.get("example.txt"), Arrays.asList("Hello", "Java NIO File Handling"), StandardOpenOption.APPEND);
            System.out.println("Data written using NIO.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
