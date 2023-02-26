import java.util.LinkedList;

public class Queue {
    LinkedList<Integer> queue = new LinkedList<>();

    public void enqueue(int o) {
        this.queue.add(o);
    }
    
    public void dequeue() {
        this.queue.remove();
    }

    public int front() {
        return this.queue.element();
    }

    public boolean isEmpty() {
        return this.queue.size() == 0;
    }

    public int size() {
        return this.queue.size();
    }
}