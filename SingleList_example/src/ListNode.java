import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2024-04-09
 * Time: 13:48
 */


public class ListNode {
    int val;
    ListNode next;
    ListNode() {

    }
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
 }
 //删除链表元素
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }
        ListNode cur = head.next;
        ListNode prev = head;
        while(cur != null){
            if(cur.val == val){
                prev.next = cur.next;
                cur = cur.next;
            }else{
                cur = cur.next;
                prev = prev.next;
            }
        }
        if(head.val == val){
            head = head.next;
        }
        return head;
    }
}

//反转链表
class Solution1 {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode cur = head.next;
        head.next = null;
        while(cur != null){
            ListNode prev = cur.next;
            cur.next = head;
            head = cur;
            cur = prev;
        }
        return head;
    }
}

//返回链表的中间节点
class Solution2 {
    public ListNode middleNode(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode cur = head;
        ListNode prev = head;
        while(cur != null && cur.next != null){
            cur = cur.next.next;
            prev = prev.next;
        }
        return prev;
    }
}

//返回倒数第k个节点
class Solution3 {
    public int kthToLast(ListNode head, int k) {
        //if(k <= 0 || head == null){
        //    return null;
        //}判断k以及head是否符合条件
        ListNode first = head;
        ListNode last = head;
        int count = 0;
        while(k-1 != count){
            first = first.next;
            //if(fast == null){
            //    return null;
            //}防止出现k比数组大的情况
            count++;
        }
        while(first.next != null){
            first = first.next;
            last = last.next;
        }
        return last.val;
    }
}

//合并两个有序列表
class Solution4 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3 = new ListNode(-1);
        ListNode list4 = list3;
        while(list1 != null && list2 != null){
            if(list1.val > list2.val){
                list3.next = list2;
                list2 = list2.next;
            }else{
                list3.next = list1;
                list1 = list1.next;
            }
            list3 = list3.next;
        }
        if(list1 != null){
            list3.next = list1;
            //list1 = list1.next
        }
        if(list2 != null){
            list3.next = list2;
            //list1 = list1.next
        }
        return list4.next;
    }
}


//分隔链表(以x为节点,小于x的,放在前面)
class Solution5 {
    public ListNode partition(ListNode head, int x) {
        if(head == null){
            return null;
        }
        ListNode big = null;
        ListNode bige = null;
        ListNode small = null;
        ListNode smalle = null;
        ListNode cur = head;
        while(cur != null){
            if(cur.val < x){
                if(small == null){
                    small = cur;
                    smalle = cur;
                }else{
                    smalle.next = cur;
                    smalle = smalle.next;
                }
            }else{
                if(big == null){
                    big = cur;
                    bige = cur;
                }else{
                    bige.next = cur;
                    bige = bige.next;
                }
            }
            cur = cur.next;
        }
        if(small == null){
            return big;
        }
        smalle.next = big;
        if(big != null){
            bige.next = null;
        }
        return small;
    }
}


//链表相交问题
class Solution6 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;
        int lenA = 0;
        int lenB = 0;
        while(curA != null){
            lenA++;
            curA = curA.next;
        }
        while(curB != null){
            lenB++;
            curB = curB.next;
        }
        curA = headA;
        curB = headB;
        int len = lenA - lenB;
        if(len < 0){
            curA = headB;
            curB = headA;
            len = lenB - lenA;
        }
        while(len != 0){
            curA = curA.next;
            len--;
        }
        while(curA != curB){
            curA = curA.next;
            curB = curB.next;
        }
        if(curB == null){
            return null;
        }
        return curA;
    }
}

//判断链表是否有环
class Solution7 {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}


//返回环形链表的入环形的起始点
class Solution8 {
    public ListNode detectCycle(ListNode head) {
        if(head == null ){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == null || fast.next == null){
                return null;
            }
            if(fast == slow){
                ListNode cur = head;
                while(cur != slow){
                    cur = cur.next;
                    slow = slow.next;
                }
                return cur;
            }
        }
        return null;
    }
}