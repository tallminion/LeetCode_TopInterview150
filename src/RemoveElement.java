import java.util.Arrays;

public class RemoveElement {
//    commit check
    static int removeElement(int[] nums, int val){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        System.out.println(removeElement(nums, val));
        System.out.println(Arrays.toString(nums));
    }
}


//https://leetcode.com/problems/remove-element/?envType=study-plan-v2&envId=top-interview-150