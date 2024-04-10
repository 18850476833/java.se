package StackDemo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2024-04-10
 * Time: 17:37
 */
public interface IStack {
    //使元素入栈
    void push(int x);

    //将栈顶元素出栈,并进行返回
    int pop();

    //查看一下栈顶元素
    int peek();

    //获取栈中有多少元素
    int size();

    //检测一下栈是不是空的
    boolean emty();

    //检查一下栈是不是满了
    boolean full();
}
