/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2023-10-14
 * Time: 20:23
 * **/
import book.BookList;
import user.AdminUser;
import user.NormalUser;
import user.User;

import java.util.Scanner;

public class Main {

    public static User login() {
        System.out.println("请输入你的姓名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("请输入你的身份，1：管理员  2：普通用户-》");
        int choice = scanner.nextInt();

        if(choice == 1) {
            //管理员
            return new AdminUser(name);
        }else {
            //普通用户
            return new NormalUser(name);
        }
    }


    public static void main(String[] args) {

        BookList bookList = new BookList();
        //user 指向哪个对象 就看返回值是什么？
        User user = login();
        while (true) {
            int choice = user.menu();
            //System.out.println("choice :"+ choice);
            //根据choice 的选择 来决定调用的是哪个方法 ？
            user.doOperation(choice,bookList);
        }
    }
}
