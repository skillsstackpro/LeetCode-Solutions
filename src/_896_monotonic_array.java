public class _896_monotonic_array {
        public boolean isMonotonic(int[] nums) {
            boolean isincreasing = true;
            boolean isdecreasing=true;
            for(int i=1;i<nums.length;i++){
                if(nums[i]>nums[i-1])
                    isdecreasing=false;

                if(nums[i]<nums[i-1])
                    isincreasing=false;
            }
            return isincreasing||isdecreasing;
        }

    public static void main(String[] args) {
        int nums[]={6,5,4,4};
        _896_monotonic_array sol = new _896_monotonic_array();
        System.out.println("array is {6,5,4,4}");
        System.out.println("monotonic is "+sol.isMonotonic(nums));
    }
}
