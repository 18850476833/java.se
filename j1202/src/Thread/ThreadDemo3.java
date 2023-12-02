package Thread;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2023-12-02
 * Time: 21:58
 */
public class ThreadDemo3 {
    private static int flag = 1;
    private static int count = 1;
    public static void main(String[] args) {
        Object object = new Object();
        Object locker = new Object();
        Thread a = new Thread(()->{
            try {
                for (int i = 0; i < 10; i++) {
                    synchronized (object){
                        object.wait(550);
                        System.out.println("C");
                    }
                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread b =new Thread(()->{
            try {
                for (int i = 0; i < 10; i++) {
                    synchronized (locker){
                        locker.wait();
                        System.out.print("B");
                    }
                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread c = new Thread(()->{
            try {
                for (int i = 0; i < 10; i++) {
                    Thread.sleep(500);
                    synchronized (locker){
                        System.out.print("A");
                        locker.notify();
                    }
                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        a.start();
        b.start();
        c.start();
    }
}
