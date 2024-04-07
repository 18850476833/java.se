import ArrayList.MyArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2024-03-12
 * Time: 14:28
 */
public class Test {
    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> ret  = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        ret.add(list);
        //从第二行开始计算每个list的数据
        for (int i = 1; i < numRows; i++){
            List<Integer> curRow = new ArrayList<>();
            curRow.add(1);
            List<Integer> prevRow = ret.get(i - 1);
            for (int j =1; j < i; j++) {
                int val = prevRow.get(j) + prevRow.get(j - 1);
                curRow.add(val);
            }
            curRow.add(1);
            ret.add(curRow);
        }
        return ret;
    }
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(1);//0
        myArrayList.add(2);//1
        myArrayList.add(199);//2
        myArrayList.display();
        System.out.println("============================");

        System.out.println(myArrayList.indexof(2));

        /* myArrayList.clear();
        myArrayList.display();*/
    }
}
