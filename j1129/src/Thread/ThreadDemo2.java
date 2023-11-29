package Thread;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2023-11-29
 * Time: 13:47
 */
//实现Runnable ,重写run
class MyThread1 implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println("hello xiaodong");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class ThreadDemo2 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new MyThread1());
        t.start();
        while(true){
            System.out.println("hello dong");
            Thread.sleep(1000);
        }
    }
}
