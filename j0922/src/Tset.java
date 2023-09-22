import java.util.Base64;
import java.util.Date;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2023-09-22
 * Time: 8:14
 */
public class Tset {
    //已知有三个类：First、Second、Third。
    // 要求定义一个打印方法，支持传入任意引用类型的参数（包括上述三个类），
    // 并在方法内部打印出对象的字符串形式。
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String a = scanner.next();
            print(Class.forName(a).newInstance());
        }
    }
    
    public static void print(object obj){
        System.out.print(obj.getClass().getName());
    }




    //在父类Base中定义了计算方法calculate()，
    // 该方法用于计算两个数的乘积（X*Y）。请在子类Sub中重写该方法，
    // 将计算逻辑由乘法改为除法（X/Y）。注意，当分母为0时输出“Error”。
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int x  = scanner.nextInt();
            int y = scanner.nextInt();
            Sub sub = new Sub(x,y);
            sub.calculate();
        }
    }*/




    //有父类Base，内部定义了x、y属性。有子类Sub，继承自父类Base。
    // 子类新增了一个z属性，并且定义了calculate方法，在此方法内计算了父类和子类中x、y、z属性三者的乘积。
    // 请补全子类构造方法的初始化逻辑，使得该计算逻辑能够正确执行。
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            Sub sub = new Sub(x,y,z);
            System.out.println(sub.calculate());
        }
    }*/





    //采用封装的思想，为Person类定义年龄属性，要求：
//修改年龄时判断其范围，若年龄小于0则按0输出，若年龄大于200则按200输出。
    /*public static void main(String[] args) {
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int age = scanner.nextInt();
            person.setAge(age);
            System.out.println(person.getAge());
        }
    }*/






    //现有一个Data类，内部定义了属性x和y，在main方法中
    // 实例化了Data类，并计算了data对象中x和y的和
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Data data = new Data(x,y);
            System.out.println(data.getX() + data.getY());
        }
    }*/
}
class First{
    public String toString(){
        return "First";
    }
}
class Second{
    public String toString(){
        return "Second";
    }
}
class Third{
    public String toString(){
        return "Third";
    }
}







/*
class Base{
    private int x = 0;
    private int y = 0;
    public Base(int x,int y){
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void calculate(){
        System.out.println(getX() * getY());
    }
}
class Sub extends Base{
    public Sub(int x,int y){
        super(x,y);
    }
    public void calculate() {
        if(getY() == 0){
            System.out.println("Error");
        }else {
            System.out.println(getX() / getY());
        }
    }
}
*/





/*class Base{
    private int x = 0;
    private int y = 0;
    public Base(int x,int y){
        this.x = x;
        this.y = y;
    }
    public int getY() {
        return y;
    }
    public int getX() {
        return x;
    }
}
class Sub extends Base{
    private int z = 0;

    public Sub(int x, int y, int z){
        super(x,y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }
    public int calculate(){
        return super.getX() * super.getY() * this.getZ();
    }
}*/






/*class Person{
    private int age = 0;

    public void setAge(int age) {

       *//* if(age < 0){
            this.age = 0;
        } else if (age > 200) {
            this.age = 200;
        }else {
            this.age = age;
        }*//*
        this.age = age;
    }

    public int getAge() {
        if(age < 0){
            return age = 0;
        } else if (age > 200) {
            return age = 200;
        }else {
            return age = age;
        }
       *//* return age;*//*
    }
}*/






/*class Data{
    private int x = 0;
    private int y = 0;
    public Data(int x ,int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}*/
