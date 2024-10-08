public class FinallyExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will cause an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e);
        } finally {
            // This block will always be executed
            System.out.println("This is the finally block.");
        }
    }
}
