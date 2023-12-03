package ThreadDemo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2023-12-03
 * Time: 19:54
 */
//初始版
/*class SingletonLazy{
    //引用指向当前唯一实例,先初始化为null,而非立即创建
    private static SingletonLazy instance = null;
    public static SingletonLazy getInstance(){
            if (instance == null){
                instance = new SingletonLazy();
            }
        return instance;
    }
}*/


    //加锁以后
/*class SingletonLazy{
    //引用指向当前唯一实例,先初始化为null,而非立即创建
    private static SingletonLazy instance = null;
    public static SingletonLazy getInstance(){
        Object object = new Object();
        synchronized (object){
            if (instance == null){
                instance = new SingletonLazy();
            }
        }
        return instance;
    }
}*/


//再加一个if
/*class SingletonLazy{
    //引用指向当前唯一实例,先初始化为null,而非立即创建
    private static SingletonLazy instance = null;
    private static Object object = new Object();
    public static SingletonLazy getInstance(){
        if(instance == null){
            synchronized (object){
                if (instance == null){
                    instance = new SingletonLazy();
                }
            }
        }
        return instance;
    }
}*/


//加上volatile
class SingletonLazy{
    //引用指向当前唯一实例,先初始化为null,而非立即创建
    private volatile static SingletonLazy instance = null;
    private static Object object = new Object();
    public static SingletonLazy getInstance(){
        if(instance == null){
            synchronized (object){
                if (instance == null){
                    instance = new SingletonLazy();
                }
            }
        }
        return instance;
    }
}
public class ThreadDemo2 {
    public static void main(String[] args) {
        SingletonLazy s1 = SingletonLazy.getInstance();
        SingletonLazy s2 = SingletonLazy.getInstance();
        System.out.println(s1 == s2);
    }
}
