package core_programming_basics.java_basics;

public class FunctionDemo {

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = add(5, 7);
        System.out.println("Sum: " + result);
    }
}