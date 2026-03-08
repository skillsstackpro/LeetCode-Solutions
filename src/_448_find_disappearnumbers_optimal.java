import java.util.*;
public class _448_find_disappearnumbers_optimal {
    public List<Integer> finddisappearednumbers(int[] nums){
        List<Integer> missing = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int temp = Math.abs(nums[i])-1;

            if(nums[temp]>0)
                nums[temp]*=-1;;
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]>0)
                missing.add(j+1);
        }
        return missing;
    }

    public static void main(String[] args) {
        int nums[] = {4,3,2,7,8,2,3,1};

        _448_find_disappearnumbers_optimal solu = new _448_find_disappearnumbers_optimal();
        List<Integer> result = solu.finddisappearednumbers(nums);
        System.out.println("missing numbers are "+result);
    }
}
