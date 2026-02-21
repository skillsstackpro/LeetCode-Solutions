import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class _01_twosum_onehash {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        // Test Data
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        _01_twosum_onehash solver = new _01_twosum_onehash();
        int[] result = solver.twoSum(nums, target);
        System.out.println("Output: " + Arrays.toString(result));
    }
}