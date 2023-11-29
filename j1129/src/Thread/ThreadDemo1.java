package Thread;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2023-11-29
 * Time: 13:40
 */
//继承thread ,重写run
class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("hello world");
    }
}
public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
    }
}
