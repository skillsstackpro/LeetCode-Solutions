public class _09_pallindrome {
        public boolean isPalindrome(int x) {
            if (x < 0) {
                return false;
            }
            int original = x;
            int reversed = 0;
            while (x > 0) {
                int digit = x % 10;
                reversed = reversed * 10 + digit;
                x /= 10;
            }
            return original == reversed;
        }
        
    public static void main(String[] args) {
        _09_pallindrome sol = new _09_pallindrome();
        int [] numbers={121,-121,10,0};

        for(int i=0;i<numbers.length;i++){
            boolean result =sol.isPalindrome(i);
            System.out.println("is " + i + " a palindrome? " + result);
        }
    }
}
