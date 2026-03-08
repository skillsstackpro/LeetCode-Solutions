import java.util.*;
public class _448_finddisappearednumbers {
    public List<Integer> finddisappearednumbers(int[] nums){
        HashSet<Integer> sol = new HashSet<>();
        List<Integer> missing = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            sol.add(nums[i]);
        }
        for(int j=1;j<=nums.length;j++){
            if(!sol.contains(j))
                missing.add(j);
        }
        return missing;
    }

    public static void main(String[] args) {
        int nums[] = {4,3,2,7,8,2,3,1};

        _448_finddisappearednumbers solu = new _448_finddisappearednumbers();
        List<Integer> result = solu.finddisappearednumbers(nums);
        System.out.println("original length "+nums.length);
        System.out.println("missing numbers are "+result);
    }
}
