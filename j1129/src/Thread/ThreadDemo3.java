package Thread;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2023-11-29
 * Time: 13:53
 */
//继承thread ,重写run, 使用匿名内部类

public class ThreadDemo3 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(){
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
            }
        };
        t.start();
        while (true){
            System.out.println("dong");
            Thread.sleep(1000);
        }
    }
}
