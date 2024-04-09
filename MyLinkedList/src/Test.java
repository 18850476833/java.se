import MyLinked.MyLinkedList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2024-04-09
 * Time: 22:48
 */
public class Test {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addLast(12);
        list.addLast(7);
        list.addLast(12);
        list.addLast(12);
        list.display();
        System.out.println("===========");
        list.addIndex(3,66);
        list.display();
        System.out.println("===============");
        System.out.println(list.contains(77));
        System.out.println("==================");
        //list.remove(25);
        //list.display();
        System.out.println("========");
        //list.removeAllkey(12);
        list.clear();
        list.display();
        System.out.println("============");
    }
}
