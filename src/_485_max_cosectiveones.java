public class _485_max_cosectiveones {
    public int findMaxConsectiveOnes(int nums[]){
        int count=0,max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                if(count>max)
                    max=count;
            }else{
                count=0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int nums[]={1,0,1,1,0,1};
        _485_max_cosectiveones sol =new _485_max_cosectiveones();
       int result= sol.findMaxConsectiveOnes(nums);
        System.out.println("array is : 1,0,1,1,0,1 ");
        System.out.println("maximum consecutive ones is : "+result);
    }
}
