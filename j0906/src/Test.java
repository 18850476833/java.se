import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: djc
 * Date: 2023-09-06
 * Time: 13:41
 */
public class Test {
    public static void main(String[] args) {

    }





    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[6];
        int[] arr1 = new int[6];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for (int i = arr.length -1; i >= 0 ; i--) {
            arr1[j] = arr[i];
            j++;
        }
        System.out.println(Arrays.toString(arr1));
    }*/





    /*public static void main(String[] args) {
        int[] b = new int[6];
        int max = 0;
        int min = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < b.length; i++) {
            b[i] = scanner.nextInt();
        }
        max = b[0];
        min = b[0];
        for (int i = 0; i < b.length; i++) {
            if(b[i] > max){
                max = b[i];
            }else if (min > b[i]){
                min = b[i];
            }
        }
        System.out.println(max + " " + min);
    }*/




    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int i = 0;
        if(a <= 0){
            System.out.println(a);
        }
        while(a > 0){
            i++;
            a  = a /10;
        }
        if(i != 0){
            System.out.println(i);
        }
    }*/
}
