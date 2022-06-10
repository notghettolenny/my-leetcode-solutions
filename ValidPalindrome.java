package leetcode;

public class ValidPalindrome {
	public static boolean isPalindrome(String s) {
		int low = 0;
		s = s.toLowerCase();
		int high = s.length()-1;
		while (low < high) {
			while(low<high&&!isAlphanumeric(s.charAt(low))) low++;
			while(low<high&&!isAlphanumeric(s.charAt(high))) high--;
			if(s.charAt(low)!=s.charAt(high)){
				return false;
			}
			low++;
			high--;
			
		}
		return true;
	}
	
	public static boolean isAlphanumeric(char c){
		if(c>='a'&&c<='z' || c>='A'&&c<='Z' || c>='0'&&c<='9'){
			return true;
		} else{
			return false;
		}
	}
	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));
	}
}

