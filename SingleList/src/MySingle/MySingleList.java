package MySingle;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2024-03-13
 * Time: 15:09
 */
public class MySingleList implements IList{
    static class ListNode{
        public int val;
        public ListNode next;
        public ListNode(int val){
            this.val = val;
        }
    }
    public ListNode head;

    public void createList(){
        //穷举的方法写出一些元素
        ListNode node1 = new ListNode(12);
        ListNode node2 = new ListNode(23);
        ListNode node3 = new ListNode(34);
        ListNode node4 = new ListNode(45);
        ListNode node5 = new ListNode(56);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        this.head = node1;
    }
    @Override
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        //先进行一个判断,判断链表是不是空的
        if (this.head == null){
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }
    }

    @Override
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        ListNode cur = this.head;
        if (this.head == null){
            this.head = node;
        }else {
            while (cur.next != null){
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    @Override
    public void addIndex(int index, int data) {
        
    }

    @Override
    public boolean contains(int key) {
        return false;
    }

    @Override
    public void remove(int key) {

    }

    @Override
    public void removeAllkey(int key) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public void display() {

    }

}
