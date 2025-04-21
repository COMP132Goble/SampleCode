package adt;

public interface COMP132List {
    public int size();
    public void add(Object element);
    public Object get(int index) throws IndexOutOfBoundsException;
    public void set(int index, Object element) throws IndexOutOfBoundsException;
    public void insert(int index, Object element) throws IndexOutOfBoundsException;
    public Object remove(int index) throws IndexOutOfBoundsException;
}
