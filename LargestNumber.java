package leetcode.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
/**
 * Given a list of non negative integers, arrange them such that they form the largest number.
 * For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330.
 * 
 * �տ��������Ŀ��׼���Ƚ�ÿ����������ɵ��������֣�Ȼ��ѡÿ�����������λ����ֵ���������򡣴˷����Ƚ��鷳���ҽ���ʵ�֡�
 * �����ο�leetcode Discuss��һλ��ţ�ķ�����������Arrays.sort(T[] a,Comparator<? super T> c)
 * �����Զ����򣬴˷��������������ʵ�֡����⣬������Ӧ�ÿ����û�������ʵ�֡�
 *
 * @author nxiangbo
 *
 */
public class LargestNumber {
	public static String largestNumber(int[] nums) {
		String result = "";
		List<ArrayList<Integer>> numsArray = new ArrayList<ArrayList<Integer>>(
				nums.length);
		int[] res = new int [nums.length];
		for (int i = 0; i < nums.length; i++) {
			ArrayList<Integer> numsList = new ArrayList<Integer>();
			while (nums[i] > 0) {
				numsList.add(nums[i] % 10);
				nums[i] = nums[i] / 10;
			}

			numsArray.add(numsList);
		}
		for (int i = 0; i < numsArray.size(); i++) {
			for (int j = 0; j < numsArray.get(i).size(); j++) {
				System.out.print(numsArray.get(i).get(j) + "  ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < numsArray.size(); i++) {
			int length = numsArray.get(i).size();
			res[i] = numsArray.get(i).get(length-1);
			if(length-1>0){
				numsArray.get(i).remove(length-1); 
			}
			
		}
		Arrays.sort(res);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
		return result;
	}
	
	/**
	 * ʹ��Arrays.sort(T[] a,Comparator<? super T> c)�Զ���ȽϷ�ʽ
	 * @param args
	 */
	public static String largestNumber2(int[] nums){
		if(nums.length<=0){
			return null ;
		}
		String[] strs = new String[nums.length];
		for (int i = 0; i < nums.length; i++) {
			strs[i] = Integer.toString(nums[i]);
		}
		
//		Comparator<String> comparator = new Comparator<String>() {
//			
//			@Override
//			public int compare(String str1, String str2) {
//				String s1 = str1+str2;
//				String s2 = str2+str1;
//				return s1.compareTo(s2);
//			}
//		};
		
		Arrays.sort(strs, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				String str1 = s1+s2;
				String str2 = s2+s1;
				return str2.compareTo(str1);
			}
		});
		
		if(strs[0].charAt(0)=='0'){
			return "0";
		}
		
		StringBuilder sb = new StringBuilder();
		for (String s : strs) {
			sb.append(s);
		}
		return sb.toString();
	}
	

	public static void main(String[] args) {
		int nums[] = { 0,0 };
		System.out.println(largestNumber2(nums));
	}
}
