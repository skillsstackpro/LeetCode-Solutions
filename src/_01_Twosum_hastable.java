import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

 public class _01_Twosum_hastable {
    public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], i);
            }
            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (map.containsKey(complement) && map.get(complement) != i) {
                    return new int[] { i, map.get(complement) };
                }
            }
            return new int[] {};
        }

    public class Main {
        public static void main(String[] args) {
            _01_Twosum_hastable solution = new _01_Twosum_hastable();
            int[] nums = {2, 7, 11, 15};
            int target = 9;
            int[] result = solution.twoSum(nums, target);
            if (result.length == 2) {
                System.out.println("Output: " + Arrays.toString(result));
                // Iska output aayega: Output: [0, 1]
            } else {
                System.out.println("Koi solution nahi mila.");
            }
        }
    }

}
