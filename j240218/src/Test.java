import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2024-02-18
 * Time: 11:16
 */
public class Test {
    public static void main1(String a,String b) throws Exception{
        if (!a.equals(b)){
            throw new Exception("密码出错");
        }
        System.out.println("登录成功");
    }
    public static void main(String[] args) {
        //String a = "123456";
        System.out.println("请输入密码:");
        Scanner scanner = new Scanner(System.in);
        String b = scanner.next();
        try{
            main1("123456",b);
        }catch(Exception e){
            System.out.println("密码错误");
        }



        int a  =10;
        if( a == 10){
            throw new NullPointerException("哈哈");
        }
    }
}
