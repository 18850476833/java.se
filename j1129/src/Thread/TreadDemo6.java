package Thread;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2023-11-29
 * Time: 14:36
 */
//给定一个很长的数组 (长度 1000w), 通过随机数的方式生成 1-100 之间的整数.
//实现代码, 能够创建两个线程, 对这个数组的所有元素求和.
//其中线程1 计算偶数下标元素的和, 线程2 计算奇数下标元素的和.
//最终再汇总两个和, 进行相加
//记录程序的执行时间.
public class TreadDemo6 {
    private static int result1 = 0;
    private static int result2 = 0;

    public static void main(String[] args) throws InterruptedException {
        //使用lambda表达式创造线程
        Thread t1 = new Thread(() -> {
            for (int i = 1; i < 100; i+=2) {
                result1 += i;
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i <= 100; i+= 2) {
                result2+= i;
            }
        });
        long beg = System.currentTimeMillis();
        t1 . start();
        t2 . start();

        t1.join();
        t2.join();
        long end = System.currentTimeMillis();
        System.out.println("result = " + (result1 + result2));
        System.out.println(end - beg);
    }
}
