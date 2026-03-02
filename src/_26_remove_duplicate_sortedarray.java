public class _26_remove_duplicate_sortedarray {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        System.out.println("no duplicate in array :");
        for(int k=0;k<i+1;k++){
            System.out.print(nums[k]);
        }
        return i+1;
    }

    public static void main(String[] args) {
        int nums[]={0,0,1,1,1,2,2,3,3,4};
        _26_remove_duplicate_sortedarray sol =new _26_remove_duplicate_sortedarray();
        int k = sol.removeDuplicates(nums);
        System.out.println("\ntotal array elements is "+k);
    }
}
