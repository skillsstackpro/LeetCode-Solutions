import java.util.*;
public class _2899_lastvisited_integers {
        public List<Integer> lastVisitedIntegers(int[] nums) {
            List<Integer>seen = new ArrayList<>();
            List<Integer>ans = new ArrayList<>();
            int k=0;
            for(int i=0;i<nums.length;i++){
                int num =nums[i];
                if(num!=-1){
                    seen.add(0,num);
                    k=0;
                }else{
                    k++;
                    if(k<=seen.size())
                        ans.add(seen.get(k-1));
                    else
                        ans.add(-1);
                }
            }

            return ans;
        }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, -1, -1, -1};

        _2899_lastvisited_integers sol = new _2899_lastvisited_integers();

        System.out.println("input array: {1, 2, -1, -1, -1}");
        System.out.println("output: " + sol.lastVisitedIntegers(nums1));
    }
}
