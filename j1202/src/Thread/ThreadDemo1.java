package Thread;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2023-12-02
 * Time: 17:05
 */
public class ThreadDemo1 {
    private volatile static int flg = 0;
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
           while (flg == 0){

           }
            System.out.println("t1线程结束");
        });
        Thread t2 = new Thread(() -> {
            System.out.println("请输入flg的值");
            Scanner scanner = new Scanner(System.in);
            flg = scanner.nextInt();
        });
        t1.start();
        t2.start();
    }
}
