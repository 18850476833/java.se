package ThreadDemo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2023-12-03
 * Time: 19:23
 */
class Singleton{
    private static Singleton instance = new Singleton();//1
    public static Singleton getInstance(){//2
        return instance;
    }
    private Singleton(){

    }//3
}

public class ThreadDemo1 {


    

}
