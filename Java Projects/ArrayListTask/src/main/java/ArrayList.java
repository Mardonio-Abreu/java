import java.util.NoSuchElementException;

public class ArrayList<T> {

    public static final int INITIAL_CAPACITY = 9;

    private T[] backingArray;
    private int size;

    public ArrayList() {
        backingArray = (T[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public void addToFront(T data) {
        if (data == null) {
            throw new IllegalArgumentException("Data cannot be null.");
        }
        if (size >= backingArray.length) {
            resizeBackingArray();
        }

        for (int i = size; i > 0; i--) {
            backingArray[i] = backingArray[i - 1];
        }

        backingArray[0] = data;
        size++;
    }

    public void addToBack(T data) {
        if (data == null) {
            throw new IllegalArgumentException("Data cannot be null.");
        }
        if (size >= backingArray.length) {
            resizeBackingArray();
        }

        backingArray[size] = data;
        size++;
    }

    public T removeFromFront() {
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }

        T frontItem = backingArray[0];

        for (int i = 0; i < size - 1; i++) {
            backingArray[i] = backingArray[i + 1];
        }

        backingArray[size - 1] = null;
        size--;

        return frontItem;
    }

    public T removeFromBack() {
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }

        T item = backingArray[size - 1];
        backingArray[size - 1] = null;
        size--;

        return item;
    }

    public T[] getBackingArray() {
        return backingArray;
    }

    public int size() {
        return size;
    }

    private void resizeBackingArray() {
        T[] newArray = (T[]) new Object[backingArray.length * 2];
        for (int i = 0; i < backingArray.length; i++) {
            newArray[i] = backingArray[i];
        }
        backingArray = newArray;
    }
}
