package operation;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2023-10-14
 * Time: 20:15
 */


import book.Book;
import book.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOPeration{


    @Override
    public void work(BookList bookList) {
        System.out.println("借阅图书！");
        /**
         * 1. 你要借阅哪本书？
         * 2. 你借阅的书有没有？
         * 3. 借阅的方式是什么？ -》 isB.... = true
         */
        Scanner scanner  = new Scanner(System.in);
        System.out.println("请输入你要借阅的图书：");
        String name = scanner.nextLine();

        int currentSize = bookList.getUsedSize();
        for (int i = 0; i < currentSize; i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)) {
                book.setBorrowed(true);
                System.out.println("借阅成功！");
                System.out.println(book);
                return;
            }
        }

        System.out.println("你借阅的图书 不存在！！ ");

    }
}
