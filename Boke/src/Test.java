/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2024-03-14
 * Time: 8:25
 */
class MyArray<T>{
    public Object[] array1 = new Object[10];
    public void setvalue(int pos,T val){
        array1[pos] = val;
    }
    public T getvalue(int pos){
        return (T)array1[pos];
    }
}

class Alg<T extends Comparable<T>> {
    public T findMaxValue(T[] array) {
        T max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max.compareTo(array[i]) < 0) {
                max = array[i];
            }
        }
        return max;
    }
}

class Alg2{
    public <T extends Comparable<T>> T findMaxValue(T[] array){
        T max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max.compareTo(array[i]) < 0){
                max = array[i];
            }
        }
        return max;
    }
}

public class Test {
    public static void main(String[] args) {
        Alg2 alg2 = new Alg2();
        Integer[] integers1 = {1,2,3,4,5,6,7};
        Integer ret1 = alg2.findMaxValue(integers1);
        System.out.println(ret1);
    }









    /*public static void main(String[] args) {
        Alg<Integer> alg = new Alg<>();
        Integer[] integers = {1, 2, 3, 4, 5, 6, 7};
        Integer ret = alg.findMaxValue(integers);
        System.out.println(ret);
    }*/
}














    /*public static void main(String[] args) {
        MyArray<Integer> myArray = new MyArray<Integer>();
        myArray.setvalue(0,10);
        myArray.setvalue(1,100);
        int a = myArray.getvalue(1);
        System.out.println(a);


        
        MyArray<String> myArray1 = new MyArray<String>();
        myArray1.setvalue(0,"hello");
        myArray1.setvalue(1,"ko");
        String b = myArray1.getvalue(0);
        System.out.println(b);
*/



        /*Integer a =10class MyArray<T>{
        public object[] array  = new object[10];

    }0;
        Integer b = 100;
        System.out.println(a == b);

        Integer aa = 200;
        Integer bb = 200;
        System.out.println(aa == bb);*/















/*    void func1 (int n){
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                count++;
            }
        }
        for (int i = 0; i < 2 * N; i++) {
            count++;
        }
        int m = 10;
        while ((m--) > 0){
            count++;
        }
    }*/
    /*Integer a =10;
    int i = a;


    int aa = a.intValue();
    double d = a.doubleValue();
*/
    //Integer aa = Integer.valueOf(10);

    /*int i = 5;
    Integer b =i;
    */
