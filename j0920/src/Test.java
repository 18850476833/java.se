import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2023-09-20
 * Time: 8:38
 */
public class Test {
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Sub sub = new Sub(x, y);
            System.out.println(sub.sum());
        }
    }*/






    /*public static void main(String[] args) {
        // Sub是需要你定义的子类
        Base base = new Sub();

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            base.setX(x);
            base.setY(y);
            System.out.println(base.calculate());
        }
    }*/





    /*public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String className = scanner.next();
            Base obj = (Base) Class.forName(className).newInstance();
            System.out.println(getClassName(obj));
        }
    }
    public static String getClassName(Base obj) {
        //write your code here......
        return obj.getClass().getName();
    }*/






    /*public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String className = scanner.next();
            // print就是需要你定义的方法
            print(Class.forName(className).newInstance());
        }
    }
    //已知有三个类：First、Second、Third。要求定义一个打印方法，
    // 支持传入任意引用类型的参数（包括上述三个类），并在方法内部打印出对象的字符串形式。
    public static void print(Object obj){
        System.out.print(obj.getClass().getName());
    }*/
}
/*class Base {
    private int x;
    private int y;
    public Base(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public final int getY() {
        return y;
    }
    public final int sum() {
        return getX() + getY();
    }
}
class Sub extends Base {

    public Sub(int x, int y) {
        super(x, y);
    }
    public int getX(){
        return super.getX()*10 ;
    }
    //write your code here......
}*/





/*abstract class Base {
    private int x;
    private int y;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int calculate() {
        if (avg() == 0) {
            return 0;
        } else {
            return sum() / avg();
        }
    }
    *//**
     * 返回x和y的和
     *//*
    public abstract int sum();
    *//**
     * 返回x和y的平均值
     *//*
    public abstract int avg();
}
class Sub extends Base {
    //write your code here......
    public int sum(){
        return getX() + getY();
    }
    public int avg(){
        return sum() / 2;
    }
}*/




/*class Base {

}
class Sub1 extends Base {

}
class Sub2 extends Base {

}*/





/*class First {
    public String toString() {
        return "First";
    }
}
class Second {
    public String toString() {
        return "Second";
    }
}
class Third {
    public String toString() {
        return "Third";
    }
}*/
