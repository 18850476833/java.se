package Thread;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2023-12-02
 * Time: 20:51
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        Object locker = new Object();
        Thread t1 = new Thread(() -> {
           synchronized (locker){
               System.out.println("t1被wait之前");
               try {
                   locker.wait();
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
               System.out.println("t1被wait之后");
           }
        });
        Thread t2 = new Thread(() ->{
            try {
                Thread.sleep(5000);
                synchronized (locker){
                    //Thread.sleep(5000);
                    System.out.println("t2notify之前");
                    locker.notify();
                    System.out.println("t2 notify之后");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        t2.start();
    }
}
