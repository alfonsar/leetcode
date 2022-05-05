package ArraysHashing;

import java.util.HashMap;

public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        //first approach would be n^2 where I check for each possible pair
        //second approach is using a hashset
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])) return new int[] {map.get(nums[i]),i};
            else{
                map.put(target-nums[i],i);
            }
        }
       return null;
    }
    
}
