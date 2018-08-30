package td1.vector;

public class StackOfInt {

    private VectorOfInt vector;

    public StackOfInt(int initialCapacity) {
        vector = new VectorOfInt(initialCapacity);
    }

    public StackOfInt() {
        this(10);
    }

    public void push(int element) {
        vector.add(element);
    }

    public int peek() {
        if (vector.isEmpty()) return 0;
        return vector.get(vector.size()-1);
    }

    public int pop() {
        int top = peek();
        vector.resize(vector.size()-1);
        return top;
    }

    public boolean isEmpty() {
        return vector.isEmpty();
    }

}
