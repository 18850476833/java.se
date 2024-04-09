package ArrayList;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2024-03-12
 * Time: 10:54
 */
public class MyArrayList implements MyList{
    public int[] elem;
    //判断数组的长度,数组每增加一个,+1
    public int usedSize;
    //给顺序表定义一个初始的大小
    public static final int DEFAULT_SIZE = 10;
    public MyArrayList(){
        this.elem  = new int[DEFAULT_SIZE];
    }


    @Override
    public void add(int data) {
        checkIsFull();
        this.elem[this.usedSize] = data;
        usedSize++;
    }
    //检查数组长度是否要扩容
    private void checkIsFull(){
        if (isFull()){
            elem = Arrays.copyOf(elem,elem.length*2);
        }
    }

    @Override
    public void add(int pos, int data) {
        try {
            checkPosOnAdd(pos);
        }catch (PosIllegality e){
            e.printStackTrace();
            return;
        }
        checkIsFull();
        for (int i = usedSize - 1; i >= pos ;i--){
            elem[i+1] = elem[i];
        }
        elem[pos]  = data;
        usedSize++;
    }
    //自定义一个异常
    public class PosIllegality extends RuntimeException{
        public PosIllegality(String msg){
            super(msg);
        }
    }
    //我们在这边要先判断一下,pos是否是合法的,有无越界,提示可能抛出异常
    private void checkPosOnAdd(int pos) throws PosIllegality{
        if (pos < 0 || pos > usedSize){
            System.out.println("不合法");
            throw new PosIllegality("插入下标越界:" + pos);
        }
    }
    //查找元素前,先判断一下,数组是不是空的
    public boolean checkusedSize(){

        return usedSize == 0;
    }
    @Override
    public boolean contain(int toFind) {
        if(checkusedSize()){
            return false;
        }
        for (int i = 0; i < usedSize; i++) {
            if (elem[i] == toFind){
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexof(int toFind) {
        if(checkusedSize()){
            return -1;
        }
        for (int i = 0; i < usedSize; i++) {
            if (elem[i] == toFind){
                return i;
            }
        }
        return -1;
    }


    //写一个判断usedSize是否为空的异常
    public class MyArrayListusedSize extends RuntimeException{
        public MyArrayListusedSize(String msg){
            super(msg);
        }
    }
    @Override
    public int get(int pos) throws MyArrayListusedSize{
        try {
            checkPosOnAdd(pos);
        }catch (PosIllegality e){
            e.printStackTrace();
            return -1;
        }
        if (checkusedSize()){
            throw new MyArrayListusedSize("顺序表为空");
        }
        return elem[pos];
    }

    @Override
    public void set(int pos, int value) {
        checkPosOnAdd(pos);
        elem[pos] = value;
    }

    @Override
    public void remove(int toRemove) {
        int index = indexof(toRemove);
        if(index == -1){
            System.out.println("没有这个数");
            return;
        }
        for (int i = index; i < usedSize-1; i++){
            elem[i] = elem[i + 1];
        }
        usedSize--;
    }

    @Override
    public int size() {
        return this.usedSize;
    }

    @Override
    public void clear() {
        this.usedSize = 0;
    }

    @Override
    public void display() {
        for (int i  =0; i < this.usedSize; i++){
            System.out.print(this.elem[i]+ " ");
        }
        System.out.println( );
    }

    @Override
    public boolean isFull() {
        if(elem.length == usedSize){
            return true;
        }
        return false;
    }
}
