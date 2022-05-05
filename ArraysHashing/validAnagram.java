package ArraysHashing;

import java.util.HashMap;

public class validAnagram {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(Character c : s.toCharArray()){
            if(!map.containsKey(c)) map.put(c,1);
            else map.put(c,map.get(c)+1);
        }
        for(Character c : t.toCharArray()){
           if(map.containsKey(c)){
               map.put(c,map.get(c)-1);
           }else{
               return false;
           }
        }
        for(Integer v: map.values()){
            if(v>0){
                return false;
            } 
        }
        return true;
    }
}
