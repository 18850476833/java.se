import MySingle.MySingleList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2024-04-07
 * Time: 22:49
 */
public class Test {
    public static void main(String[] args) {
        MySingleList mySingleList = new MySingleList();
        mySingleList.addLast(12);
        mySingleList.addLast(23);
        mySingleList.addLast(45);
        mySingleList.addLast(21);
        mySingleList.addLast(66);
        mySingleList.display();
        System.out.println("===================================");

        mySingleList.addFirst(99);
        mySingleList.addLast(88);
        mySingleList.display();
        System.out.println("=====================================");

        System.out.println(mySingleList.contains(77));
        mySingleList.remove(45);
        mySingleList.display();
        System.out.println("=====================================");

        System.out.println(mySingleList.size());
        System.out.println("============================");
        mySingleList.clear();
        System.out.println(mySingleList.size());
        System.out.println("=======================");
        mySingleList.display();


    }
}
