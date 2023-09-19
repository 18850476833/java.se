import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2023-09-19
 * Time: 8:16
 */
public class Test {






    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Sub sub = new Sub(x, y);
            sub.calculate();
        }
    }*/




    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            Sub sub = new Sub(x, y, z);
            System.out.println(sub.calculate());
        }
    }*/




    /*public static void main(String[] args) {
        Person p = new Person();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            p.setAge(age);
            System.out.println(p.getAge());
        }
    }*/




    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Data data = new Data(x, y);
            System.out.println(data.getX() + data.getY());
        }
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

    public int getY() {
        return y;
    }

    public void calculate() {
        System.out.println(getX() * getY());
    }

}

class Sub extends Base {
    public Sub(int x, int y){
        super(x,y);
    }
    public void calculate(){
        if(getY() == 0){
            System.out.println("Error");
        }else{
            System.out.println(getX() / getY());
        }
    }
}*/





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
    public int getY() {
        return y;
    }

}

class Sub extends Base {
    private int z;
    public Sub(int x, int y, int z) {
        //write your code here
        super(x,y);
        this.z = z;
    }
    public int getZ() {
        return z;
    }
    public int calculate() {
        return super.getX() * super.getY() * this.getZ();
    }
}*/






/*
class Person {

        private int age;

        public int getAge() {
            if(age < 0){
                age = 0;
            } else if (age > 200) {
                age = 200;
            }
            return this.age;
        }

        public void setAge(int age) {
            if(age < 0){
                this.age = 0;
            } else if (age > 200) {
                this.age = 200;
            }else {
                this.age =age;
            }
        }
        //write your code here......

}

class Data {

    private int x;
    private int y;

    public Data(int x, int y) {
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
