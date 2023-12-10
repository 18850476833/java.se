/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2023-12-10
 * Time: 18:59
 */
class Animal{
    public String name;
    public int age;
    public void eat(){
        System.out.println(this.name + "吃饭");
    }
    public Animal(String name , int age){
        this.name = name;
        this.age = age;
    }
}


class Dog extends Animal{
    public Dog(){
        super("小黄",8);
    }
    public void bark(){
        System.out.println(this.name + "汪汪叫");
    }
}
class Cat extends Animal{
    public Cat(){
        super("咪咪",6);
    }
    public void miaomiao(){
        System.out.println(this.name + "喵喵叫");
    }
}
class Student{

}
class Teacher{

}
class School{
    public Student[] students;
    public Teacher[] teachers;
}
public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.miaomiao();
    }
}
