public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(logic(nums));
    }
    static int logic(int[] nums){
        int count = 0;
        int element = 0;
        for (int i = 0; i < nums.length; i++) {
            if(count==0) element = nums[i];
            else if (element == nums[i]) {
                count++;
            } else count--;
        }
        return element;
    }
}
