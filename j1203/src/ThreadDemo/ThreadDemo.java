package ThreadDemo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2023-12-03
 * Time: 22:58
 */
//实现阻塞队列

//为了简单,不写作泛型的形式,考虑储存的元素就单纯地泛型
class MyBlockingQueue{
    private String[] elems = null;
    private int head = 0;
    private int tail = 0;
    private int size = 0;

    //准备锁对象,如果用this也是可以的
    private Object locker = new Object();
    public MyBlockingQueue(int capactity){
        elems = new String[capactity];
    }
    public void put(String elem) throws InterruptedException {
        //锁加到这个地方和加到方法上本质是一样的,,加到方法上就是给this加锁,此处是给locker加锁
        synchronized (locker){
            //这里用while的原因是,如果用if,发生了长时间的阻塞,我们并不知道有些值会有啥改变
            //用while的话,在阻塞等待结束后,还会再进入while重下检查一下
            while(size >= elems.length){
                //队列满了,后续让这个代码阻塞
                locker.wait();
            }
            //新的元素要放在tail指向的位置上
            elems[tail] = elem;
            tail++;
            if (tail >= elems.length){
                tail = 0;
            }
            size++;
            //入队列成功之后呼唤
            locker.notify();
        }
    }
    public String taken() throws InterruptedException {
        String elem = null;
        synchronized (locker){
            while(size == 0){
                //队列空了以后,后续也要让这个代码阻塞
                locker.wait();
            }
            elem = elems[head];
            head++;
            if (head >= elems.length){
                head = 0;
            }
            //这个代码千万别漏
            size--;
            //元素出队列之后,加上成功唤醒
            locker.notify();
        }
        return elem;
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        MyBlockingQueue queue = new MyBlockingQueue(1000);
        Thread t1 = new Thread(() ->{
           int n =1;
           while (true){
               try {
                   queue.put(n + " ");
                   System.out.println("生产元素" + n);
                   n++;
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
        });
        Thread t2 = new Thread(()->{
           while(true){
               String n = null;
               try {
                   n = queue.taken();
                   System.out.println("消费元素" + n);
                   Thread.sleep(500);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
        });
        t1.start();
        t2.start();
    }
}
