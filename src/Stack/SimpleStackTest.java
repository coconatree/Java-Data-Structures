package Stack;

import Utility.Constants;

public class SimpleStackTest
{
    public static void main(String[] args)
    {
        SimpleStackWithQueue stack = new SimpleStackWithQueue();

        stack.push("EMRE_1");
        stack.push("EMRE_2");
        stack.push("EMRE_3");
        stack.push("EMRE_2");
        stack.push("EMRE_3");
        stack.push("EMRE_4");
        stack.push("EMRE_5");
        stack.push("EMRE_6");
        stack.push("EMRE_7");

        System.out.println(stack.toString());
        System.out.println(Constants.DIVIDER);

        stack.pop();
        stack.pop();

        System.out.println(stack.toString());
    }
}
