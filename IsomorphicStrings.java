package leetcode;

/**
 * For example,
 * Given "egg", "add", return true.
 * Given "foo", "bar", return false.
 * Given "paper", "title", return true.
 * 
 * @author nxiangbo
 *
 */
public class IsomorphicStrings {
	 public boolean isIsomorphic(String s, String t) {
	        if(s==null && t==null){
	            return true;
	        }
	        
	        if(s==null || t==null){
	            return false;
	        }
	        if(s.length()!=t.length()){
	            return false;
	        }
	        
	        int[] map1 = new int[256];
	        int[] map2 = new int[256];
	        for(int i=0;i<s.length();i++){
	            if(map1[s.charAt(i)]!=map2[t.charAt(i)]){
	                return false;
	            }
	            map1[s.charAt(i)] = i+1;
	            map2[t.charAt(i)] = i+1;
	            
	        }
	        
	        return true;
	    }
}
