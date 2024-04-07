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

    /*public void createList(){
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
    }*/
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
        int len = size();
        if (index < 0 || index > len){
            return ; //自定义一个异常
        }
        if (index == 0){
            addFirst(data);
            return;
        }
        if (index == len){
            addLast(data);
            return;
        }
        ListNode cur = searchPrev(index);
        ListNode node = new ListNode(data);
        node.next = cur.next;
        cur.next = node;
    }
    private ListNode searchPrev(int index){
        ListNode cur = head;
        int cunt = 0;
        while (cunt != index - 1){
            cur = cur.next;
            cunt++;
        }
        return cur;
    }


    @Override
    public boolean contains(int key) {
        ListNode cur = head;
        while (cur != null){
            if (cur.val == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    @Override
    public void remove(int key) {
        if (head == null){
            return;//可以写一个异常
        }
        if (head.val == key){
            head = head.next;
            return;
        }
        ListNode cur = findPrev(key);
        if (cur == null){
            System.out.println("没有要删除的数字");
            return;
        }
        ListNode del = cur.next;
        cur.next = del.next;
    }
    private ListNode findPrev(int key){
        ListNode cur = head;
        while (cur.next != null){
            if (cur.next.val == key){
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }


    @Override
    public void removeAllkey(int key) {
        if (head == null){
            return;
        }
        ListNode prev = head;
        ListNode cur = head.next;
        while (cur != null){
            if (cur.val == key){
                prev.next = cur.next;
                cur = cur.next;

            }else {
                prev = cur;
                cur = cur.next;
            }
        }
        if (head.val == key){
            head = head.next;
        }
    }

    @Override
    public int size() {
        int count = 0;
        ListNode cur = head;
        while (cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }

    @Override
    public void clear() {
        ListNode cur = head;
        while (cur != null){
            ListNode curNext = cur.next;
            cur.next = null;
            cur = curNext;
        }
        head = null;
    }

    @Override
    public void display() {
        ListNode cur = head;
        while (cur != null){
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println( );
    }
}
