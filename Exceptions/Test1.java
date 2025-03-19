package Exceptions;

public class Test1 {
    public static void main(String[] args) {
        System.err.println("Main starting");
        methodA();
        System.err.println("Main ending");
    }

    public static void methodA() {
        System.err.println("methodA starting");
        methodB();
        System.err.println("methodA ending");
    }

    public static void methodB() {
        System.err.println("methodB starting");
        int[] arr = new int[5];
        arr[5] = 10;
        System.err.println("methodB ending");
    }
}
