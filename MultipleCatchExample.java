public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[6] = 10; // This will cause ArrayIndexOutOfBoundsException
            int result = 10 / 0; // This will cause ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds!");
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}
