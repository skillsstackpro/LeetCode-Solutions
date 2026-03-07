public class _283_Move_Zeroes {
    public void moveZeroes(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp =nums[i];
                nums[i]=nums[k];
                nums[k]=temp;
                k++;
            }
        }
    }

    public static void main(String[] args) {
        int nums[]={0,1,0,3,12};
        _283_Move_Zeroes sol = new _283_Move_Zeroes();
        sol.moveZeroes(nums);
        System.out.println("Move zeroes");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+",");
        }
    }
}
