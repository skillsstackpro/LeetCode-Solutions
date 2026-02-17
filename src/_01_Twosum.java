import java.util.Arrays;

public class _01_Twosum {
        public int[] twoSum(int[] nums, int target) {

            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {

                    if (nums[i] + nums[j] == target) {
                        return new int[] { i, j };
                    }
                }
            }

            return new int[] {};
        }


    public static void main(String[] args) {
        int nums[]= {2,7,11,15};
        int target =9;
        _01_Twosum solver = new _01_Twosum();
        int [] result =solver.twoSum(nums,target);
        System.out.println("output : "+ Arrays.toString(result));



    }

}
