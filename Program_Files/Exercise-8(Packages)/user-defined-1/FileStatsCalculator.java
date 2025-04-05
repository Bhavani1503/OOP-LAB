import file.utils.FileOperations;
import string.utils.StringOperations;
import java.io.IOException;

public class FileStatsCalculator {
    public static void main(String[] args) {
        String filePath = "sample.txt";
        try {
            // Create and write to file
            FileOperations.createFile(filePath);
            FileOperations.writeToFile(filePath, "This is a sample text file.\n");
            FileOperations.appendToFile(filePath, "It contains multiple lines.\n");
            FileOperations.appendToFile(filePath, "For demonstration purposes.\n");
            
            // Read and analyze file
            String content = FileOperations.readFile(filePath);
            System.out.println("File content:\n" + content);
            
            System.out.println("\nFile statistics:");
            System.out.println("Line count: " + FileOperations.countLines(filePath));
            System.out.println("Vowel count: " + StringOperations.countVowels(content));
            System.out.println("Character count: " + content.length());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}