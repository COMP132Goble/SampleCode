package adt;

public class MyArrayList implements COMP132List {
    Object[] elem = new Object[5];
    int size = 0;


    public void add(Object x) {
        if (size == elem.length) {
            // resize array
        } else {
            elem[size] = x;
            size++;
        }
    }

    public int size() {
        return size;
    }

    public Object get(int i) {
        if (i > size || i < 0) {
            System.out.println("Out of bounds, lol");
            return null;
        } else {
            return elem[i];
        }
    }

    public void set(int i, Object x) {
        if (i > size || i < 0) {
            System.out.println("Out of bounds, lol");
        } else {
            elem[i] = x;
        }
    }

    public void insert(int i, Object x) {
        Object[] temp = new Object[elem.length];
        for(int j = 0; j < i; j++) {
            temp[j] = elem[j];
        } 
        temp[i] = x;
        for(int j = i; j < temp.length-1; j++) {
            temp[j+1] = elem[j];
        }
        elem = temp;
        size++;
    }

    public Object remove(int index) {
        return null;
    }

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
        list.print();
        list.add('a');
        list.print();
        list.add('b');
        list.add('c');
        list.print();
        System.out.println(list.size());
        System.out.println(list.get(2));
        System.out.println("***********************************************");
        list.set(0, 'q');
        list.print();
        list.insert(1, 'x');
        list.print();
        list.remove(3);
        list.print();
    }
}
