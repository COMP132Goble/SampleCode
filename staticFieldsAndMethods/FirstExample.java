package staticFieldsAndMethods;

public class FirstExample {
    private static int x = 1;
    private int y;

    public FirstExample() {
        this.y = 5;
    }

    public void doStuff(int dx, int dy) {
        x = x + dx;
        y = y + dy;
    }

    public static void messWithX(int dx) {
        x = x - dx;
    }

    public String toString() {
        return "x = " + x + " : y = " + y;
    }

    public static void main(String[] args) {
        FirstExample fse1 = new FirstExample();
		FirstExample fse2 = new FirstExample();

		fse1.doStuff(3, 4);  // use object reference to invoke instance method.
		System.out.println("fse1: " + fse1.toString());
		System.out.println("fse2: " + fse2);  // same as fse2.toString();

		fse2.doStuff(4, 5);
		System.out.println("fse1: " + fse1);
		System.out.println("fse2: " + fse2);

		FirstExample.messWithX(2);  // Use class name to invoke static method
		System.out.println("fse1: " + fse1);
		System.out.println("fse2: " + fse2);
    }
}
