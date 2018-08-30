package td1.vector;

import java.util.Arrays;

public class VectorOfInt {

    private int[] elements;
    private int size;

    public VectorOfInt(int initialCapacity) {
        elements = new int[initialCapacity];
        size = 0;
    }

    public VectorOfInt() {
        this(10);
    }

    void ensureCapacity(int capacity) {
    		int oldCapacity = elements.length;
        if (capacity > oldCapacity) {
            int newCapacity = oldCapacity * 2;
            if (newCapacity < capacity)
                newCapacity = capacity;
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    void resize(int size) {
        ensureCapacity(size);
        this.size = size;
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return size()==0;
    }

    void add(int element) {
        ensureCapacity(size+1);
        elements[size] = element;
        size++;
    }

    void set(int index, int element) {
        if (index>=size) return;
        elements[index] = element;
    }

    int get(int index) {
        if (index>=size) return 0;
        return elements[index];
    }

}
