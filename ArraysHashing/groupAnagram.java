package ArraysHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class groupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<String,List<String>>();
        for(String s: strs){
            char[] arr = new char[26];
            for(Character c: s.toCharArray()){
                arr[c-'a']++;
                System.out.println("VALUE: "+arr[c-'a']);
            }
           String temporary = new String(arr);
            if(!map.containsKey(temporary)){
                map.put(temporary, new ArrayList<>());
            }
            map.get(temporary).add(s);
        }
        List<List<String>> result = new ArrayList<List<String>>(map.values());
        return result;
        
    }
}
