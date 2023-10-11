import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2023-09-26
 * Time: 8:51
 */
public class Test {
    public static void main(String[] args) {
        int j = 0;
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[]ret = str.split(" ");
        for (int i = 0; i < ret.length; i++) {
            j++;
        }
        System.out.println(j);
    }
}
