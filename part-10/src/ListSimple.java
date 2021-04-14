import java.util.Arrays;

public class ListSimple<E> {
    private int size = 0;
    private int DEFAULT_CAPACITY = 10;
    private Object elements[];
    public ListSimple() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa() {
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }
    public E get(int i) {
        if(i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }

    public static void main(String[] args) {
        ListSimple listSimple = new ListSimple();
        listSimple.add(2);
        listSimple.add(4);
        listSimple.add(7);
        listSimple.add(21);
        System.out.println(listSimple.get(0));
//        listSimple.get(-1);
//        System.out.println("element -1: " + listSimple.get(-1));
    }
}
