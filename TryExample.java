public class TryExample {
    public static void main(String[] args) {
        try {
            // Code that might throw an exception
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[3]); // This will cause an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An error occurred: " + e);
        }
    }
}
