package Thread;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2023-11-29
 * Time: 13:58
 */
//继承runnable,重写run,使用匿名内部类
public class ThreadDemo4 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    System.out.println("xiao");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                //System.out.println("1");
            }
        });
        t.start();
        while (true){
            System.out.println("dong");
            Thread.sleep(1000);
        }
        //System.out.println("2");
    }
}

