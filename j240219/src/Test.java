/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2024-02-19
 * Time: 11:59
 */
public class Test {
    public static void logInfo(String userName, String password) throws UserNameException,PasswordException{
        if ( !userName.equals(userName)){
            System.out.println("用户名有问题");
        }
        if ( !password.equals(password)){
            System.out.println("密码有问题");
        }
        System.out.println("登录成功");
    }

    public static void main(String[] args) {
        try {
            logInfo("haha","123456");
        }catch(PasswordException e){

        }catch(UserNameException e){

        }finally{

        }
    }
    class UserNameException extends Exception{
        public UserNameException(String message){
            super(message);
        }
    }
    class PasswordException extends Exception{
        public PasswordException(String message){
            super(message);
        }
    }














    /*public static void func() throws CloneNotSupportedException{
        int a = 10;
        if (a == 10){
            throw new CloneNotSupportedException("haha");
        }
    }
    public static void main(String[] args) {
        try {
            func();
        }catch(CloneNotSupportedException e){
            System.out.println("出错啦");
            e.printStackTrace();
        }
    }*/

}
