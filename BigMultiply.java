package leetcode;

import java.util.ArrayList;

import javax.xml.bind.Marshaller.Listener;
import javax.xml.transform.ErrorListener;

public class BigMultiply {
	public static String bigMultiply(String num1, String num2){
		if(num1.length()<=0||num2.length()<=0){
			throw new ArrayIndexOutOfBoundsException();
		}
		if(num1.equals("0")||num2.equals("0")){
			return "0";
		}
		String result = "";
		String reversed1 = reverse(num1);
		String reversed2 = reverse(num2);
//		int[] result = new int[reversed1.length()+reversed2.length()];
		ArrayList<Integer> result_each = new ArrayList<Integer>();
		for (int i = 0; i < reversed1.length()+reversed2.length(); i++) {
			result_each.add(0);
		}
		for (int i = 0; i < reversed1.length(); i++) {
			for (int j = 0; j < reversed2.length(); j++) {
				int temp = (reversed1.charAt(i)-'0')*(reversed2.charAt(j)-'0')+result_each.get(i+j);
				result_each.set(i+j,temp) ;
			}
		}
		
		for (int i = result_each.size()-1; i >= 0; i--) {
			if(result_each.get(i)!=0){
				break;
			} else{
				result_each.remove(i);
			}
		}
		
		for (Integer integer : result_each) {
			System.out.println(integer);
		}
		
		for (int i = 0; i < result_each.size(); i++) {
			if(result_each.get(i)>=10){
				int temp = result_each.get(i)/10;
				result += result_each.get(i)%10;
				if(i+1<result_each.size()){
					result_each.set(i+1, result_each.get(i+1)+temp);
				} else{
					result += temp;
				}
				
			} else{
				result+=result_each.get(i);
			}
		}
		
		
		result = reverse(result);
		System.out.println(result);
		return result;
	}
	
	public static String reverse(String str){
		String reversed = "";
		if(str.length()<=1){
			return str;
		}
		for (int i = str.length()-1; i >=0; i--) {
			reversed += str.charAt(i);
		}
		return reversed;
		
	}
	
	public static void main(String[] args) {
		String str = "5";
		String str2 = "12";
		
		
		bigMultiply(str, str2);
		
	}
}
