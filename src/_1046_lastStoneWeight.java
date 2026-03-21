import java.util.*;

public class _1046_lastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue <Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i =0;i<stones.length;i++){
            pq.add(stones[i]);
        }
        while(pq.size()>1){
            int y=pq.poll();
            int x =pq.poll();
            if(y!=x){
                pq.add(y-x);
            }
        }
        if(pq.isEmpty())
            return 0;

        return pq.poll();
    }

    public static void main(String[] args) {
        _1046_lastStoneWeight sol = new _1046_lastStoneWeight();
        int stones[]={2,7,4,1,8,1};
        System.out.println("stones array is {2,7,4,1,8,1} ");
        System.out.println("last stone weight is :"+sol.lastStoneWeight(stones));
    }

}
