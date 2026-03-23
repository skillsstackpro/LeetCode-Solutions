import java.util.Arrays;
public class _1984_minimum_difference {
        public int minimumDifference(int[] nums, int k) {
            if(k==1)
                return 0;
            Arrays.sort(nums);
            int min=Integer.MAX_VALUE;
            for(int i=0;i<=nums.length-k;i++){
                int curr =nums[i+k-1]-nums[i];
                min=Math.min(min,curr);
            }
            return min;
        }

    public static void main(String[] args) {
        int nums[]={90,41,84,11,27,136,104};
        int k=2;
        _1984_minimum_difference sol = new _1984_minimum_difference();

        System.out.println("array is {90,41,84,11,27,136,104} and k =2 ");
        System.out.println("minumum difference is "+sol.minimumDifference(nums,k));
    }

}
