package Stack;

import LinkedList.Node;
import LinkedList.SimpleLinkedList;
import Queue.SimpleQueue;
import Utility.Constants;

public class SimpleStackWithQueue
{
    SimpleQueue q1;
    SimpleQueue q2;
    SimpleQueue q3;

    public SimpleStackWithQueue()
    {
        this.q1 = new SimpleQueue();
        this.q2 = new SimpleQueue();
    }

    public void push(String data)
    {

        this.q2.enqueue(data);

        while (!this.q1.isEmpty())
        {
            this.q2.enqueue(this.q1.dequeue().getData());
        }

        this.q3 = this.q1;
        this.q1 = this.q2;
        this.q2 = this.q3;
    }

    public Node pop()
    {
        if (this.q1.isEmpty())
        {
            return null;
        }
        else
            {
                Node node = q1.dequeue();
                return node;
            }
    }

    @Override
    public String  toString()
    {
        return "QUEUE 1: \n" + this.q1.toString() + Constants.DIVIDER + '\n' + "QUEUE 2: \n" + this.q2.toString();
    }
}
