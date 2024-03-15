/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2024-03-14
 * Time: 8:25
 */
class MyArray<T>{
    public Object[] array = new Object[10];
    public void setvalue(int pos,T val){
        array[pos] = val;
    }
    public T getvalue(int pos){
        return (T)array[pos];
    }
}
public class Test {
    public static void main(String[] args) {
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




        /*Integer a =10class MyArray<T>{
        public object[] array  = new object[10];

    }0;
        Integer b = 100;
        System.out.println(a == b);

        Integer aa = 200;
        Integer bb = 200;
        System.out.println(aa == bb);*/

    }














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



}
