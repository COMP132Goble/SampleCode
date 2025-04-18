package adt;

public class MyArrayList {
    Object[] elem = new Object[5];
    int size = 0;

    public void print() {
        for (Object object : elem) {
            if (object == null) {
                System.out.println("null");
            } else {
                System.out.println(object);
            }
        }
        System.out.println("***********************************************");
    }

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        // list.print();
        // list.add('a');
        // list.add('b');
        // list.add('c');
        // list.print();
        // System.out.println(list.size());
        // System.out.println(list.get(2));
        // System.out.println("***********************************************");
        // list.set(0, 'q');
        // list.print();
        // list.insert(1, 'x');
        // list.print();
    }
}
