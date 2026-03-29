public class _1550_three_consecutive_odds {
        public boolean threeConsecutiveOdds(int[] arr) {
            int count =0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]%2!=0){
                    count++;
                    if(count==3)
                        return true;
                }else
                    count =0;
            }
            return false;
        }

    public static void main(String[] args) {
        int arr[]={1,2,34,3,4,5,7,23,12};
        _1550_three_consecutive_odds sol = new _1550_three_consecutive_odds();

        System.out.println("array is {1,2,34,3,4,5,7,23,12} ");
        System.out.println("three old consecutives "+sol.threeConsecutiveOdds(arr));
    }

}
