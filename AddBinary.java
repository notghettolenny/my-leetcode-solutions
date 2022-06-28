package leetcode;

public class AddBinary {
	public static String addBinary(String a, String b) {
		String result = "";
		String result2 = "";
        if(a==null && b==null){
        	return null;
        }
        int carry = 0;
        int indexA = a.length()-1;
        int indexB = b.length()-1;
        while(indexA>=0 || indexB>=0 || carry !=0){
//        	System.out.println("indexA = "+indexA+"  indexB = "+indexB);
        	int sum = 0;
        	if(indexA<0&&indexB>=0){
        		sum = (b.charAt(indexB)-'0')+carry;
        	}
        	if(indexB<0&&indexA>=0){
        		sum = (a.charAt(indexA)-'0')+carry;
        	}
        	if(indexA>=0&&indexB>=0){
        		sum = (a.charAt(indexA)-'0')+(b.charAt(indexB)-'0')+carry;
        	}
        	
        	if(indexA<0&&indexB<0){
        		sum = carry;
        	}
        	int eachBit = sum%2;
        	carry = sum/2;
        	result += eachBit+"";
//        	System.out.println(result);
        	indexA--;
        	indexB--;
        }
        for (int i = result.length()-1; i >=0; i--) {
			result2 +=result.charAt(i);
		}
        
        return result2;
    }
	
	public static void main(String[] args) {
		String a = "11";
		String b = "1";
		String result = addBinary(a, b);
		System.out.println(result);
	}
}
