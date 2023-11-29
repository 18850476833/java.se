package Thread;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2023-11-29
 * Time: 13:40
 */
//继承thread ,重写run
class MyThread extends Thread{
    @Override
    public void run() {
        //在这个代码中,如果想获取线程引用,用this即可
        //System.out.println("hello world");
        System.out.println(this.getId() + " ," + this.getName());
    }
}
public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread t1 = new MyThread();
        Thread t2 = new MyThread();
        t1.start();
        t2.start();
    }
}
