import java.lang.reflect.Array;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2023-10-08
 * Time: 8:15
 */
public class Test {
    /*public int missingNumber(int[] nums) {
            int len = nums.length;
            int i = 0;
            int[] src = new int[len];
            for( i = 0;i < len; i++){
                src[i] = i;
            }
            for(int j = 0; j < len; j++){
                for(i = 0; i < len ; i++){
                    if(nums[j] == src[i]){
                        nums[j] = 0;
                    }
                }
            }
            for(i = 0; i < len; i++){
                if(nums[i] != 0){
                    return nums[i];
                }
            }
        }*/

    public static void main(String[] args) {
        int[] num = new int[]{1,2,3};
        int k = 4;
        Solution a = new Solution(num,k);
        for (int j : num) {
            System.out.print(j);
        }
    }
}
class Solution {
    public Solution(int[] num, int k) {
        int[] src = new int[num.length];
        int len = num.length;
        for(int i =0 ;i < num.length ;i++){
            src[i] = num[i];
        }
        int i = 0;
        for(int j = k; j < num.length; j++){
            num[j] = src[i];
            i++;
        }
    }
}