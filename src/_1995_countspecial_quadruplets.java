public class _1995_countspecial_quadruplets {
    public int countQuadruplets(int[] nums) {
        int count =0;
        int n =nums.length;
        for(int a=0;a<n-3;a++){
            for(int b=a+1;b<n-2;b++){
                for(int c=b+1;c<n-1;c++){
                    for(int d=c+1;d<n;d++){
                        if(nums[a]+nums[b]+nums[c]==nums[d])
                            count++;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,6};
        _1995_countspecial_quadruplets sol = new _1995_countspecial_quadruplets();

        System.out.println("array is {1,2,3,6}");
        System.out.println("Total quadruplets "+sol.countQuadruplets(nums));
    }
}
