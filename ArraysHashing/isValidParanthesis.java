package ArraysHashing;
import java.util.Stack;

//https://leetcode.com/problems/valid-parentheses/
public class isValidParanthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(Character c: s.toCharArray()){
            if(stack.isEmpty()) stack.push(c);
            else if(c=='[' || c=='(' || c=='{') stack.push(c);
            else if(c==']'){
                if(stack.peek()=='[') stack.pop();
                else stack.push(c);
            }else if(c=='}'){
                if(stack.peek()=='{') stack.pop();
                else stack.push(c);
            }else if(c==')'){
                if(stack.peek()=='(') stack.pop();
                else stack.push(c);
            }
        }
        return stack.isEmpty();
        
    }
}
