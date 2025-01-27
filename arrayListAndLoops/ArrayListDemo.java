package arrayListAndLoops;

import java.util.ArrayList;

public class ArrayListDemo {
    private ArrayList<String> theList;

    public ArrayListDemo() {
        theList = new ArrayList<String>();
    }

    public void arrayListOperations() {
        String str1 = "First Item";
        String str2 = "Second Item";

        theList.add(str1);
        theList.add(str2);

        String str3 = theList.get(0);
        System.out.println("Object at index 0 is " + str3);
        System.out.println("Object at index 1 is " + theList.get(1));

        int size = theList.size();
        System.out.println("theList has size " + size);

        theList.remove(0);
        System.out.println("Now Object at index 0 is " + theList.get(0));
        System.out.println("Now size is " + theList.size());
    }

    public static void main(String[] args) {
        ArrayListDemo arrLstDemo = new ArrayListDemo();
        arrLstDemo.arrayListOperations();
    }
}
