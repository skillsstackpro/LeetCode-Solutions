public class _746_min_cost_climbingstairs {
    public int minCostClimbingStairs(int[] cost){
        int n= cost.length;
        for(int i=2;i<n;i++){
            cost[i]=cost[i]+Math.min(cost[i-1],cost[i-2]);
        }
        return Math.min(cost[n-1],cost[n-2]);
    }

    public static void main(String[] args) {
        int cost[]={1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        _746_min_cost_climbingstairs sol = new _746_min_cost_climbingstairs();
        int result = sol.minCostClimbingStairs(cost);
        System.out.println("cost array is : {1, 100, 1, 1, 1, 100, 1, 1, 100, 1} ");
        System.out.println("minimum cost to reach top : "+result);
    }
}
