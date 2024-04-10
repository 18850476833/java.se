import ni_bo_lan.Mynibolan;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2024-04-10
 * Time: 20:22
 */
public class Test {
    public static void main(String[] args) {
        Mynibolan mynibolan =new Mynibolan();
        String[] tokens = new String[]{"4","13","5","/","+"};
        int ret = mynibolan.evalRPN(tokens);
        System.out.println(ret);

        MinStack minStack = new MinStack();

    }
}
