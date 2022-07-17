package leetcode.sort;

import java.util.HashMap;

public class ValidAnagram {
	 public static boolean isAnagram(String s, String t) {
	        if(s==null || t==null){
	        	return false;
	        }
	        
	        if(s.length()!=t.length()){
	        	return false;
	        }
	        HashMap<Character, Integer> sMap = new HashMap<>();
	        HashMap<Character, Integer> tMap = new HashMap<>();
	        for (int i = 0; i < s.length(); i++) {
	        	Integer freq1 = sMap.get(s.charAt(i));
	        	Integer freq2 = tMap.get(t.charAt(i));
				sMap.put(s.charAt(i), (freq1==null)?1:freq1+1);
				tMap.put(t.charAt(i), (freq2==null)?1:freq2+1);
			}
	        
	        
	       return sMap.equals(tMap);
	        
	 }
	 
	 public static boolean isAnagram2(String s, String t){
		 int[] alphabet = new int[26];
		 for (int i = 0; i < s.length(); i++) {
			alphabet[s.charAt(i)-'a']++;
		}
		for (int i = 0; i < t.length(); i++) {
			alphabet[t.charAt(i)-'a']--;
		}
		for (int i = 0; i < alphabet.length; i++) {
			if(alphabet[i]!=0){
				return false;
			}
		}
		return true;
	 }
	 
	 public static void main(String[] args) {
		String s = "aabbbb";
		String t = "bbaaaa";
		System.out.println(isAnagram(s, t));
	}
}
