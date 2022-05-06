//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/
import java.util.Stack;

public abstract class removeAdjacents {
    public String removeDuplicates(String s, int k) {
        char[] phrase = s.toCharArray();
        Stack<Pair<Character,Integer>> stack = new Stack<Pair<Character,Integer>>();
        for(int i=0;i<phrase.length;i++){
            if(stack.isEmpty()) {
                stack.push(new Pair<Character,Integer>(phrase[i],1));
                continue;
            }
            char cK = stack.peek().getKey();
            int cV = stack.peek().getValue();
            if(cK==phrase[i]){
                if(cV + 1 == k){
                    int curr_k = k-1;
                    while(curr_k>0){
                        stack.pop();
                        curr_k--;
                    }
                    
                }else{
                    stack.push(new Pair<Character,Integer>(cK,cV+1));
                }
            }else{
                stack.push(new Pair<Character,Integer>(phrase[i],1));
            }
        }
        char[] arr = new char[stack.size()];
        int i=stack.size()-1;
        while(!stack.isEmpty()){
            arr[i]=stack.pop().getKey();
            i--;
        }
        return new String(arr);
    }
    
}
