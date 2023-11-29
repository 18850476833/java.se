package Thread;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2023-11-29
 * Time: 14:05
 */
//使用lembda表达式
public class TreadDemo5 {
    //private static boolean isQuit = false;//标志位
    public static void main(String[] args){
        /*Thread t = new Thread(() -> {
           *//*while (!Thread.currentThread().isInterrupted()){
               System.out.println("xiaodong");
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }*//*
            for (int i = 0; i < 5; i++) {
                System.out.println("工作中");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("线程执行结束");
        });*/
        Thread t1 = new Thread(() ->{
           Thread t = Thread.currentThread();
            System.out.println(t.getName());
        });
        Thread t2 = new Thread(() ->{
            Thread t = Thread.currentThread();
            System.out.println(t.getName());
        });
        t1.start();
        t2.start();
        //t.start();
        //这个操作就是等待线程
        //t.join();
        //Thread.sleep(1000);
        //System.out.println("期望在t线程结束后打印");
        //t.interrupt();
        //isQuit = true;

        /*while(true){
            System.out.println("dong");
            Thread.sleep(1000);
        }*/
    }
}
