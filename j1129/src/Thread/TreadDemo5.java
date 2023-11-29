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
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
           while (true){
               System.out.println("xiaodong");
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
        });
        t.start();
        while(true){
            System.out.println("dong");
            Thread.sleep(1000);
        }
    }
}
