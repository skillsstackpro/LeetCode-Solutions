public class _724_find_pivotindex {
        public int pivotIndex(int[] nums) {
            int totalsum=0,leftsum=0,rightsum=0;
            for(int i=0;i<nums.length;i++){
                totalsum+=nums[i];
            }
            for(int j=0;j<nums.length;j++){
                rightsum=totalsum-leftsum-nums[j];
                if(rightsum==leftsum){
                    return j;
                }
                leftsum+=nums[j];
            }
            return -1;
        }

    public static void main(String[] args) {
        int nums[]={2,1,-1};
        _724_find_pivotindex sol = new _724_find_pivotindex();
        int result = sol.pivotIndex(nums);
        System.out.println("Array is : {2,1,-1} ");
        System.out.println("pivot index is : "+result);
    }

}
