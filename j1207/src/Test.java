import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2023-12-07
 * Time: 13:27
 */
class PetDog{
    //这里就是属性
    public String name;
    public String color;

    //这下面是方法,也叫行为
    public void barks(){
        System.out.println(name + "旺旺~~~~");
    }
    public void wag(){
        System.out.println(name + "摇尾巴~~~");
    }

}

class Student{
    public String name;
    public int age;
    public Student(){
        this.name = "张三";
        this.age = 9;
        System.out.println("student().....");
    }
    /*public Student(){
        this("张三",9);
    }*/
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
}


public class Test {
    private String name;
    public int age;
    public static String classRoom;
    //两个共有一个成员变量,可以加一个static,设为静态变量
    public static void func(){
        System.out.println("静态");
        //System.out.println(this.name);
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public static void main(String[] args) {
        Test.func();
    }
    public static void main3(String[] args) {
        Student student = new Student();
        System.out.println(student.name);
        System.out.println(student.age);
    }


    public static void main1(String[] args) {
        PetDog petDog = new PetDog();
        petDog.name = "小黄";
        petDog.color = "黄色";
        System.out.println(petDog.name);
        petDog.barks();
        petDog.wag();
    }
}
