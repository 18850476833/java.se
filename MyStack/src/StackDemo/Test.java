package StackDemo;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2024-04-10
 * Time: 19:21
 */
public class Test {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(3);
        myStack.push(5);
        myStack.push(7);
        int ret = myStack.pop();
        System.out.println(ret);
        
    }
}
