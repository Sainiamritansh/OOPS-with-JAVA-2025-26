package EndSemPractical;

public class ques1 {

    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int result = a / b;  
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
