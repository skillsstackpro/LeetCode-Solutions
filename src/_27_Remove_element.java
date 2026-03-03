public class _27_Remove_element {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (val != nums[j]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        // Test case
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        _27_Remove_element sol = new _27_Remove_element();
        int count = sol.removeElement(nums, val);
        System.out.println("Total elements left: " + count);
        System.out.print("Array after removing element " + val + ": [ ");
        for (int k = 0; k < count; k++) {
            System.out.print(nums[k] + " ");
        }
        System.out.println("]");
    }
}