import java.util.HashSet;
public class _217_contains_duplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(seen.contains(nums[i]))
                return true;
            seen.add(nums[i]);
        }
        return false; //use hashmap due to time complexity
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        _217_contains_duplicate sol=new _217_contains_duplicate();
        boolean result = sol.containsDuplicate(nums);
        System.out.println(result);
    }
}
