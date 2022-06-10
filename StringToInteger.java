package leetcode;

public class StringToInteger {
	public static int myAtoi(String str) {
		int result = 0;
		int flag = 1;
		String strs = str.trim();
//		System.out.println(strs);
		char[] chars = strs.toCharArray();
		if (chars.length <= 0) {
			return 0;
		}

		int i=0;
		if (chars[0] == '+') {
			flag = 1;
			i++;
		} else if (chars[0] == '-') {
			flag = -1;
			i++;
		} 
		for (; i < chars.length; ++i) {
			int num = chars[i] - 48;
			System.out.println(num);
			if(num<0||num>9){
				break;
			}
			if(result>Integer.MAX_VALUE/10||result == Integer.MAX_VALUE/10&&num>Integer.MAX_VALUE%10){
				return flag == 1?Integer.MAX_VALUE:Integer.MIN_VALUE;
			} else{
				result = result*10+num;
			}
			
			System.out.println(result);
		}
		result = result * flag;
		return result;
	}
	
	public int myAtoi2(String str) {
	    int index = 0, sign = 1, total = 0;
	    //1. Empty string
	    if(str.length() == 0) return 0;

	    //2. Remove Spaces
	    while(str.charAt(index) == ' ' && index < str.length())
	        index ++;

	    //3. Handle signs
	    if(str.charAt(index) == '+' || str.charAt(index) == '-'){
	        sign = str.charAt(index) == '+' ? 1 : -1;
	        index ++;
	    }

	    //4. Convert number and avoid overflow
	    while(index < str.length()){
	        int digit = str.charAt(index) - '0';
	        if(digit < 0 || digit > 9) break;

	        //check if total will be overflow after 10 times and add digit
	        if(Integer.MAX_VALUE/10 < total || Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE %10 < digit)
	            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

	        total = 10 * total + digit;
	        index ++;
	    }
	    return total * sign;
	}
	
	public static boolean myatoi(String str){
		if(str==null)  return false;
		if(str.matches("(\\s+)?(-|\\+)?\\d+")){
			return true;
		} else{
			return false;
		}
	}

	public static void main(String[] args) {
		String str = "  -12";
		System.out.println(myatoi(str));
	}
}
