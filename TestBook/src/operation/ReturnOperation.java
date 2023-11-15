package operation;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2023-10-14
 * Time: 20:19
 */

import book.Book;
import book.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOPeration{


    @Override
    public void work(BookList bookList) {
        System.out.println("归还图书！");

        Scanner scanner  = new Scanner(System.in);
        System.out.println("请输入你要归还的图书：");
        String name = scanner.nextLine();

        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)) {
                book.setBorrowed(false);
                System.out.println("归还成功！");
                System.out.println(book);
                return;
            }
        }
        System.out.println("你归还的图书 不存在！！ ");
    }
}
