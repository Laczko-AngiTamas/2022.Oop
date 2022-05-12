package lab11_4;

import java.util.ArrayList;

public class Stack {
    private ArrayList<Object> items = new ArrayList<>();
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
    }

    public boolean isFull() {
        return this.items.size() == this.capacity;
    }

    public void push(Object newObject) {
        if (!isFull()) {
            items.add(newObject);
        }
    }

    public boolean isEmpty() {
        return this.items.size() == 0;
    }

    public Object pop() {
        if (!isEmpty()) {
            Object result = items.get(items.size()-1);
            this.items.remove(this.items.size() - 1);
            return result;
        }
        return null;
    }

    public Object top() {
        if (!isEmpty()) {
            return this.items.get(this.items.size() - 1);
        }
        return null;
    }
}
