package adt;

public class MyLinkedList {
    private SinglyLinkedNode head;
    private int size = 0;

    public void printList() {
        SinglyLinkedNode cur = head;
        
        System.out.print("head -> ");
        while(cur != null) {
            System.out.print(cur.element + " -> ");
            cur = cur.next;
        }
        System.out.println("null");
    }

    public SinglyLinkedNode getLast() {
    	SinglyLinkedNode current = head;
    	while(current.next !=null) {
    		current = current.next;
    	}
    	return current;
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
