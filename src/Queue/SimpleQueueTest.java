package Queue;

import Utility.Constants;

public class SimpleQueueTest
{
    public static void main(String[] args)
    {
        SimpleQueue queue = new SimpleQueue();

        queue.enqueue("EMRE_1");
        queue.enqueue("EMRE_2");
        queue.enqueue("EMRE_3");
        queue.enqueue("EMRE_4");
        queue.enqueue("EMRE_5");

        System.out.println(queue.toString());

        queue.dequeue();
        queue.dequeue();

        System.out.println(Constants.DIVIDER);
        System.out.println(queue.toString());

        queue.enqueue("EMRE_1");
        queue.enqueue("EMRE_2");

        System.out.println(Constants.DIVIDER);
        System.out.println(queue.toString());
        System.out.println(Constants.DIVIDER);
        System.out.println(queue.isEmpty());
    }
}
