import java.util.HashMap;

public class _594_LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int maxLen=0;
        for(int key:map.keySet()){
            if(map.containsKey(key+1)){
                maxLen=Math.max(maxLen,map.get(key)+map.get(key+1));
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        _594_LongestHarmoniousSubsequence sol = new _594_LongestHarmoniousSubsequence();

        int result = sol.findLHS(nums);
        System.out.println("Array: [1, 3, 2, 2, 5, 2, 3, 7]");
        System.out.println("Maximum length of harmonious subsequence: " + result);
    }
}
