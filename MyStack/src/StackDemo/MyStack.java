package StackDemo;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2024-04-10
 * Time: 17:36
 */
public class MyStack implements IStack{
    private int[] elem;
    private int usedSize;//用来访问存放元素的下标
    private static final int DEFAULT_CAPACITY = 10;
    public MyStack(){
        elem = new int[DEFAULT_CAPACITY];
    }
    @Override
    public void push(int x) {
        if (full()){
            elem = Arrays.copyOf(elem,elem.length*2);
        }
        elem[usedSize] = x;
        usedSize++;
    }

    @Override
    public int pop() {
        if (emty()){
            throw new EmptyException("栈空了！");
            //可以自定义异常下
        }
        int old = elem[usedSize - 1];
        usedSize--;
        return old;
    }

    @Override
    public int peek() {
        if (emty()){
            return -1;
            //可以自定义异常下
        }
        return elem[usedSize - 1];
    }

    @Override
    public int size() {
        return usedSize;
    }

    @Override
    public boolean emty() {
        if (usedSize == 0){
            return true;
        }
        return false;
    }

    @Override
    public boolean full() {
        if (elem.length == usedSize){
            return true;
        }
        return false;
    }
}
