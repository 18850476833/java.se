package ThreadDemo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2023-12-03
 * Time: 22:45
 */
//使用阻塞队列
public class ThreadDemo3 {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(100);
        queue.put("aaa");
        String elem = queue.take();
        System.out.println("elem = " + elem);
        elem = queue.take();
        System.out.println("elem = " + elem);
    }
}
