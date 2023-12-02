package Thread;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2023-12-02
 * Time: 13:16
 */
public class ThreadDemo {
    private static int count = 0;
    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        Thread t1 = new Thread(() ->{
            for (int i = 0; i < 10000; i++) {
                synchronized (object){
                    count++;
                }
            }

        });
        Thread t2 = new Thread(() ->{
            for (int i = 0; i < 10000; i++) {
                synchronized (object){
                    count++;
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(count);


        Thread t3 = new Thread(() ->{
           synchronized (object){
               synchronized (object){
                   System.out.println("hello");
               }
           }
        });
        t3.start();
    }
}
