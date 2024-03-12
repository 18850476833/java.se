package ArrayList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2024-03-12
 * Time: 10:39
 */
public interface MyList {
    //新增元素,默认在数组最后新增
    public void add (int data);

    //在pos位置新增元素
    public void add(int pos, int data);

    //判断是否包含某个元素
    public boolean contain(int toFind);

    //查找某个元素对应位置
    public int indexof(int toFind);

    //查找pos位置的元素
    public int get(int pos);

    //给pos位置元素设为value
    public void set(int pos,int value);

    //删除第一次出现的关键字
    public void remove(int toRemove);

    //获取顺序表的长度
    public int size();

    //清空顺序表
    public void clear();

    //打印顺序表
    public void display();

    //判断数组是否满了
    boolean isFull();
}
