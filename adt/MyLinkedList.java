package adt;

public class MyLinkedList implements COMP132List {
    private SinglyLinkedNode head;
    private SinglyLinkedNode tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add("Hello");
        list.add("World");
        list.printList();
        // System.out.println(list.get(1));
        // list.set(1, "class");
        // list.printList();
    }

    public int size() {
        return size;
    }

    public void add(Object element) {
        
    }

    private SinglyLinkedNode getNode(int index) {
        SinglyLinkedNode node = head;
        for(int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public Object get(int index) throws IndexOutOfBoundsException {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        SinglyLinkedNode current = getNode(index);
        return current.element;
    }

    public void set(int index, Object element) throws IndexOutOfBoundsException {
        
    }

    public void insert(int index, Object element) throws IndexOutOfBoundsException {

    }

    public Object remove(int index) throws IndexOutOfBoundsException {
        return null;
    }

    public void printList() {
        SinglyLinkedNode cur = head;
        
        System.out.print("head -> ");
        while(cur != null) {
            System.out.print(cur.element + " -> ");
            cur = cur.next;
        }
        System.out.println("null");
    }

    private static class SinglyLinkedNode {
        public SinglyLinkedNode next;
        public Object element;

        public SinglyLinkedNode(Object element) {
            this.element = element;
            next = null;
        }
    }
}
