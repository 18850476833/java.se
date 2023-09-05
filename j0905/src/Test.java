
import sun.applet.Main;

import java.util.Scanner;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: djc
 * Date: 2023-09-05
 * Time: 8:18
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int i = 0;

    }


    /*public static void main(String[] args) {
        Test main = new Test();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(main.isPrimeNumber(a));
    }
    public Boolean isPrimeNumber(int a){
        for (int i = 3; i < a; i+=2){
            if(a % 2 == 0 || a % i ==0){
                return false;
            }
        }
        return true;
    }*/






    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float sum = 0F;
        float count = 0F;
        int i = 0;
        while(scanner.hasNext()){
            int a = scanner.nextInt();
            if(a >= 0){
                i++;
                sum = sum + a;
            }else {
                break;
            }
        }
        count = sum / (float)i;
        System.out.println(String.format("%.2f", count));
    }*/





    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float h = scanner.nextFloat();
        int b = scanner.nextInt();
        float getLong = 0;
        for (int i = 0; i < b; i++) {
            getLong = getLong + h;
            h = h / 2;
            if(i == b -1){
                break;
            }else {
                getLong = getLong + h;
            }
        }
        System.out.println(String.format("%.3f", h)+" "+String.format("%.3f", getLong));
    }//String.format是一种输出的方法，类似c语言的printf*/




    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int ret =getCM(a,b) ;
        System.out.println(ret);
    }
    public static int getCM(int a, int b){
        if(a % b == 0 ){
            return a;
        } else if(b % a == 0) {
            return b;
        } else if (a % 2==0 && b % 2==0) {
            return a/2 * b;
        } else if (a % 3 == 0 && b % 3==0) {
            return a/3 * b;
        }else {
            return a * b;
        }
    }*/



    /*public static void main(String[] args) {
        int count =0 ;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int a = scanner.nextInt();
            if (a > 0){
                count++;
            }else {
                break;
            }
        }
        System.out.println(count);
    }*/




    /*public static void main(String[] args) {
        long a = 9L;
        long b = 0L;
        long count = 0L;
        for (int i =0; i < 10; i++) {
            b =10 * b + a;
            count = count + b;
        }
        System.out.println(count);
    }
*/


    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String emailMatcher = "[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+";
        if(str.matches(emailMatcher)){
            System.out.println("邮箱格式合法");
        }else {
            System.out.println("邮箱格式不合法");
        }matches是在正则表达式中检测是否符合表达式的
    }*/


    //第一种，运用charAt（0)可以使用char进行输入
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char grade  = scanner.next().charAt(0);
        if (grade == 'A') {
            System.out.println("优秀");
        } else if (grade == 'B') {
            System.out.println("良好");
        } else if (grade == 'C') {
            System.out.println("及格");
        }else if (grade == 'D') {
            System.out.println("不及格");
        }else {
            System.out.println("未知等级");
        }*/
        //第二种     使用equals进行字符串对比
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String grade  = scanner.nextLine();
        if ("A".equals(grade)) {
            System.out.println("优秀");
        } else if (grade.equals("B")) {
            System.out.println("良好");
        } else if (grade.equals("C")) {
            System.out.println("及格");
        }else if (grade.equals("D")) {
            System.out.println("不及格");
        }else {
            System.out.println("未知等级");
        }
    }*/




   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextDouble();
        double k = scanner.nextDouble();
        double index = k / (m * m);
        if(index < 18.5){
            System.out.println("偏瘦");
        } else if (index >= 18.5 && index < 20.9) {
            System.out.println("苗条");
        } else if (index >= 20.9 && index <= 24.9) {
            System.out.println("适中");
        }else {
            System.out.println("偏胖");
        }
    }*/





    /*public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int price = scanner.nextInt();
        int cost = 0;
        if(price >= 100 && price < 500){
            cost  = (int) (0.9 * price);
        } else if (price >= 500 && price < 2000) {
            cost = (int) (0.8 * price);
        } else if (price >= 2000 && price < 5000) {
            cost = (int) (0.7 * price);
        } else if (price >= 5000) {
            cost = (int) (0.6 * price);
        }else {
            cost = price;
        }
        System.out.println(cost);
    }*/




    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        //第一种
        System.out.println("交换前" + a + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("交换后" + a + " " + b);
        //第二种
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + " " + b);
    }*/




    /*定义一个int类型变量i,i为由浮点数变量d四舍五入后的整数类型，请将转换后的i进行输出
    四舍五入之后的整数（小数点后一位>=5则进一，否则舍去）*/
    /*public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        double d = scanner.nextDouble();
        int i =0;
        double a =0 ;
        int b =(int)d;
        a = d - b;
        if(a / 0.5 >= 1){
            i = b + 1;
        }else{
            i = b;
        }
        System.out.println(i);
    }*/
}
