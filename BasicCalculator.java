package leetcode;

public class BasicCalculator {
	public static int calculate(String s) {
        String[] digits = s.split("[\\+\\-\\*/]");
        String[] operators = s.split("[0-9]");
        for (String string : digits) {
			System.out.println(string);
		}
        
        for (String string : operators) {
			System.out.println(string);
		}
        for(int i=0;i<s.length();i++){
        	if(s.charAt(i)=='+'){
        		
        	}
        }
        return 0;
    }
	
	public static void main(String[] args) {
		String s = "12+4389-43*32/3";
		calculate(s);
	}
}
