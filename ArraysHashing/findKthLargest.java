package ArraysHashing;

import java.util.PriorityQueue;

//https://leetcode.com/problems/kth-largest-element-in-an-array/
public class findKthLargest {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int n: nums){
            pq.add(n);
        }
        while(pq.size()!=k){
            pq.poll();
        }      
        return pq.peek();
    }
}
}
