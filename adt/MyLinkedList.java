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
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
    }

    public int size() {
        return size;
    }

    public void add(Object element) {
        SinglyLinkedNode node = new SinglyLinkedNode(element);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
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
            throw new IndexOutOfBoundsException("tried to access " + index + 
                    " but the size of the list is " + size + ".");
        }
        SinglyLinkedNode current = getNode(index);
        return current.element;
    }

    public void set(int index, Object element) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("tried to set " + index + " but size is "
                    + size + ".");
        }
        else {
            SinglyLinkedNode node = getNode(index);
            node.element = element;
        }
    }

    public void insert(int index, Object element) throws IndexOutOfBoundsException {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("tried to set " + index + " but size is "
                    + size + ".");
        }
        else {
            SinglyLinkedNode newNode = new SinglyLinkedNode(element);
            
            if (index == 0) {
                newNode.next = head;
                head = newNode;
            }
            else {
                /*
                 * Walk down the chain of links until pred refers to the node that will
                 * precede the new node in the list.
                 */
                SinglyLinkedNode pred = head;
                for (int i=0; i<index-1; i++) {
                    pred = pred.next;
                } 
                
                newNode.next = pred.next;
                pred.next = newNode;
            }
            
            size++;
        }
    }

    public Object remove(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("tried to set " + index + " but size is "
                    + size + ".");
        }
        else {
            Object obj = null;

            if (index == 0) {
                obj = head.element;
                head = head.next;
            }
            else {
                SinglyLinkedNode pred = head;
                
                for (int i=0; i<index-1; i++) {
                    pred = pred.next;
                } 
                
                SinglyLinkedNode node = pred.next;
                obj = node.element;
                pred.next = node.next;
               
                if (index == size - 1) {
                    tail = pred;
                }
            }
            
            size--;
            return obj;
        }
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
