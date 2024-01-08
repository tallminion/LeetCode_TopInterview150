public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(logic(nums));
    }
    static int logic(int[] nums){
        int count = 0;
        int element = 0;
        for (int i : nums) {
            if(count==0) element = nums[i];
            else if (element == nums[i]) {
                count++;
            } else count--;
        }
        return element;
    }
}
