package LinkedList;

import java.util.ArrayList;

public class SimpleLinkedList
{
    private Node head = null;
    private int size;

    public SimpleLinkedList() {}

    public void addToTail(String data)
    {
        Node node = new Node(data);

        if (this.head == null)
        {
            this.head = node;
        }
        else
            {
            Node last = this.head;

            while (last.getNext() != null)
            {
                last = last.getNext();
            }

            last.setNext(node);
        }

        this.size++;
    }

    public Node removeFromHead()
    {
        Node node = this.head;

        if (node != null && node == this.head)
        {
            this.head = node.getNext();
            return node;
        }
        else { return null; }
    }

        public boolean isEmpty()
    {
        return this.size == 0;
    }

    public Node get(String key)
    {
        Node node = this.head;

        while(node.getNext() != null)
        {
            if(node.getData().equals(key))
            {
                return node;
            }
            else
                {
                    node = node.getNext();
                }
        }
        return null;
    }


    @Override
    public String toString()
    {
        Node node = this.head;

        String ret = "";

        while (node != null)
        {
            ret = ret + "DATA: " + node.getData() + '\n';

            node = node.getNext();
        }
        return ret;
    }
}
