public class _3866_firstunique_evennumbers {
    public int firstUniqueEven(int[] nums) {
        int freq[]= new int[101];
        for(int num:nums)
            freq[num]++;
        for(int num:nums){
            if(num%2==0 && freq[num]==1)
                return num;
        }
        return -1;
    }

    public static void main(String[] args) {
        _3866_firstunique_evennumbers sol = new _3866_firstunique_evennumbers();

        // Test Case 1
        int[] nums1 = {2, 3, 4, 2, 8, 4};
        System.out.println("Array: [2, 3, 4, 2, 8, 4]");
        System.out.println("First Unique Even is: " + sol.firstUniqueEven(nums1));
    }
}
