package LinkedList;


import Utility.Constants;

public class LinkedListTest
{
    public static void main(String[] args)
    {
        SimpleLinkedList list = new SimpleLinkedList();

        list.addToTail("1");
        list.addToTail("2");
        list.addToTail("3");
        list.addToTail("4");
        list.addToTail("5");
        list.addToTail("6");
        list.addToTail("7");

        System.out.println(list.toString());
        System.out.println(Constants.DIVIDER);
        System.out.println(list.removeFromHead());

        System.out.println(list.removeFromHead().getData());

        System.out.println(Constants.DIVIDER);
        System.out.println(list.toString());
        System.out.println(Constants.DIVIDER);

        list.get("5").setData(":)");

        System.out.println(list.toString());

        System.out.println(Constants.DIVIDER);
        System.out.println(list.isEmpty());
    }
}
