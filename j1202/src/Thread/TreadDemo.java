package Thread;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2023-12-02
 * Time: 15:44
 */
public class TreadDemo {
    public static void main(String[] args) {
        Object object = new Object();
        Object locker = new Object();
        Thread t1 = new Thread(() ->{
           synchronized (object){
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
               synchronized (locker){
                   System.out.println("t1拿了两把锁");
               }
           }
        });
        Thread t2 = new Thread(() ->{
            synchronized (object){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (locker){
                    System.out.println("t2拿到了两把锁");
                }
            }
        });
        /*Thread t2 = new Thread(() ->{
           synchronized (locker){
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
               synchronized (object){
                   System.out.println("t2拿到了两把锁");
               }
           }
        });*/
        t1.start();
        t2.start();
    }
}
