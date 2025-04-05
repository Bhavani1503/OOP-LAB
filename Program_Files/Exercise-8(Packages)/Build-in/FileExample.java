import java.io.*;

public class FileExample {
    public static void main(String[] args) {
        try {
            // Write to file
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, Java File I/O!");
            writer.close();
            
            // Read from file
            BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
            String line = reader.readLine();
            System.out.println("File content: " + line);
            reader.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}