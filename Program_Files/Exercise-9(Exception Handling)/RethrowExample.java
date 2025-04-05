public class RethrowExample {
    public static void riskyMethod() throws Exception {
        throw new Exception("Something went wrong!");
    }

    public static void main(String[] args) {
        try {
            riskyMethod();
        } catch (Exception e) {
            System.out.println("Caught an error: " + e.getMessage());
            throw new RuntimeException("Re-throwing the exception!", e);
        }
    }
}

