package MySingle;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2024-03-13
 * Time: 15:08
 */
public interface IList {
    //头插法
    void addFirst(int data);
    //尾插法
    void addLast(int data);
    //任意位置插入,第一个数据节点为0号下标
    void addIndex(int index, int data);
    //查找是否包含关键字key,是否在单链表中
    boolean contains(int key);
    //删除第一次出现关键字为key的节点
    void remove(int key);
    //删除所有值为key节点
    void removeAllkey(int key);
    //得到单链表的长度
    int size();
    //清空单链表
    void clear();
    //打印单链表的内容
    void display();
}
