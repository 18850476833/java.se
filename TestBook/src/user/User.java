package user;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2023-10-14
 * Time: 20:37
 */

import book.BookList;
import operation.IOPeration;

public abstract class User {
    protected String name;

    protected IOPeration[] ioPerations;

    public User(String name) {
        this.name = name;
    }

    public abstract int menu();


    public void doOperation(int choice, BookList bookList) {
        ioPerations[choice].work(bookList);
    }

}
