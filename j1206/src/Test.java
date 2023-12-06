import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2023-12-06
 * Time: 19:36
 */
public class Test {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}};
        int[][] array1 = new int[][]{{1,2,3},{4,5,6}};
        int[][] array2 = new int[2][3];

        //不规则二维数组
        int[][] array3 = new int[2][];
    }


    public static void main5(String[] args) {
        int[]array6 = {7,2,3,4,5};
        int[]array7 =Arrays.copyOf(array6,array6.length);

        /*for (int i = 0; i < array6.length; i++) {
            array7[i] = array6[i];
        }*/
        System.out.println(Arrays.toString(array7));
    }


    public static void func1(int[] array){
        array[0] = 99;
    }
    public static void func2(int[]array5){
        array5 = new int[]{11,22,33,44,55};
        System.out.println(Arrays.toString(array5));
    }
    public static void main4(String[] args) {
        int[] array4 = {1,2,3,4,5};
        func1(array4);
        func2(array4);
        System.out.println(Arrays.toString(array4));
    }


    public static void main3(String[] args) {
        //第一种
        int[] array  = {1,2,3,4,5};
        //第二种
        int[] array1 = new int[]{1,2,3,4,5};
        //第三种
        int[] array2 = new int[10];
        //第四种
        int a = 5;
        int[] array3 = new int[a];
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        for (int x :array1) {
            System.out.println(x + " ");
        }
        System.out.println(Arrays.toString(array));
    }


    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b;
    }
    public static double sum(double a, double b){
        return a+b;
    }

    public static void main2(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println(sum(x, y));
    }
    

    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            float a = scanner.nextFloat();
            System.out.println(a);
        }
    }
}
