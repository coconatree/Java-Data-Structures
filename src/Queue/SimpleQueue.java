package Queue;

import LinkedList.Node;
import LinkedList.SimpleLinkedList;

public class SimpleQueue
{
    private SimpleLinkedList list;

    private int size;

    public SimpleQueue()
    {
        this.list = new SimpleLinkedList();
        this.size = 0;
    }

    public void enqueue(String data)
    {
        this.list.addToTail(data);
        this.size++;
    }

    public Node dequeue()
    {
        this.size--;
        return this.list.removeFromHead();
    }

    public boolean isEmpty()
    {
        return this.size == 0;
    }

    @Override
    public String toString()
    {
        return this.list.toString();
    }
}
