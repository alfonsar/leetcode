package ArraysHashing;
//https://leetcode.com/problems/top-k-frequent-elements/
public class topKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer> ();
        for(int i : nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
               map.put(i,1); 
            }
        }
       PriorityQueue<Pair<Integer,Integer> > pq=
                new PriorityQueue<Pair<Integer,Integer>>(Comparator.comparing(Pair::getValue));
         for (Map.Entry<Integer,Integer> entry : map.entrySet()){
             pq.add(new Pair(entry.getKey(),entry.getValue()));
             if(pq.size()>k)pq.poll();
         }
        System.out.println(pq.peek().getValue());
        int[] res = new int[k];
        while(k>0){
            res[k-1]=pq.poll().getKey();
            k--;
        }
        return res;
    }
}
