package MyLinked;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2024-04-09
 * Time: 22:41
 */
public class MyLinkedList implements IList{
    static class ListNode{
        public int val ;
        public ListNode next;
        public ListNode prev;
        public ListNode(int val){
            this.val = val;
        }
    }
    public ListNode head;
    public ListNode last;

    @Override
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if (head == null){
            head = node;
            last = node;
        }else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    @Override
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        if (head == null){
            head = node;
            last = node;
        }else {
            last.next = node;
            node.prev = last;
            last = node;
        }
    }

    @Override
    public void addIndex(int index, int data) {
        try {
            checkIndex(index);
        }catch (IndexException e){
            e.printStackTrace();
            return;
        }
        int len = size();
        if (index == 0){
            addFirst(data);
            return;
        }
        if (index == len){
            addLast(data);
            return;
        }
        ListNode cur = findIndex(index);
        ListNode node = new ListNode(data);
        //先连后再连前
        node.next = cur;
        node.prev = cur.prev;
        cur.prev.next = node;
        cur.prev = node;
    }
    public ListNode findIndex(int index){
        ListNode cur = head;
        while (index != 0){
            cur = cur.next;
            index--;
        }
        return cur;
    }
    //自定义一个index的异常
    public class IndexException extends RuntimeException{
        public IndexException(String msg){
            super(msg);
        }
    }
    //这边是异常对index进行检查
    public void checkIndex(int index) throws IndexException{
        if (index < 0 || index > size()){
            System.out.println("插入位置不合法");
            throw new IndexException("插入下标过小或过大" + index);
        }
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
        ListNode cur = head;
        while (cur != null){
            if (cur.val == key) {
                if (cur == head) {
                    head = head.next;
                    if (head == null) {
                        last = null;
                    } else {
                        head.prev = null;
                    }
                } else {
                    /*if (cur == last) {
                        last.prev.next = null;
                        last = last.prev;
                    } else {
                        cur.prev.next = cur.next;
                        cur.next.prev = cur.prev;
                    }*/
                    if (cur.next == null) {
                        cur.prev.next = cur.next;
                        last = last.prev;
                    } else {
                        cur.prev.next = cur.next;
                        cur.next.prev = cur.prev;
                    }
                }
                return;
            }else {
                cur = cur.next;
            }
        }
    }

    @Override
    public void removeAllkey(int key) {
        ListNode cur = head;
        while (cur != null){
            if (cur.val == key) {
                if (cur == head) {
                    head = head.next;
                    if (head == null) {
                        last = null;
                    } else {
                        head.prev = null;
                    }
                } else {
                    /*if (cur == last) {
                        last.prev.next = null;
                        last = last.prev;
                    } else {
                        cur.prev.next = cur.next;
                        cur.next.prev = cur.prev;
                    }*/
                    if (cur.next == null) {
                        cur.prev.next = cur.next;
                        last = last.prev;
                    } else {
                        cur.prev.next = cur.next;
                        cur.next.prev = cur.prev;
                    }
                }
            }
            cur = cur.next;
        }
    }

    @Override
    public int size() {
        ListNode cur = head;
        int count = 0;
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
            ListNode list = cur.next;
            cur.prev = null;
            cur.next = null;
            cur = list;
        }
        head = null;
        last = null;
    }

    @Override
    public void display() {
        ListNode cur = head;
        while (cur != null){
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}
