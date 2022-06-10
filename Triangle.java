package leetcode;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

public class Triangle {
	 public static int minimumTotal(List<List<Integer>> triangle) {
		 if(triangle.size() == 1){
			 return triangle.get(0).get(0);
		 }
		 int result[] = new int[triangle.size()];
		 for (int i = 0; i < result.length; i++) {
			result[i] = triangle.get(triangle.size()-1).get(i);
		}
		 for (int i = triangle.size()-2; i >= 0; i--) {
			for (int j = 0; j < i+1; j++) {
				if(triangle.get(i+1).get(j)>triangle.get(i+1).get(j+1)){
					
					result[j] = result[j]+triangle.get(i+1).get(j+1);
				} else{
					result[j] += triangle.get(i+1).get(j);
				}
				
				System.out.println(result+"result");
			}
		}
		return result[0];
	 }
	 
	 public static int getMinimumForRow(List<Integer> row){
		 int minmum = 0;
		 if(row.size()==1){
			 minmum = row.get(0);
		 } else if(row.size()> 1){
			 minmum = row.get(0);
			 for (int i = 1; i < row.size(); i++) {
				if(row.get(i) < minmum){
					minmum = row.get(i);
				}
			}
		 }
		 return minmum;
	 }
	 
	 public static void main(String[] args) {
		List<Integer> row1 = new ArrayList<Integer>();
		row1.add(-1);
		List<Integer> row2 = new ArrayList<Integer>();
		row2.add(2);
		row2.add(3);
		List<Integer> row3 = new ArrayList<Integer>();
		row3.add(1);
		row3.add(-1);
		row3.add(-3);
//		List<Integer> row4 = new ArrayList<Integer>();
//		row4.add(4);
//		row4.add(1);
//		row4.add(8);
//		row4.add(3);
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
//		triangle.add(row4);
		
		
		triangle.add(row1);
		triangle.add(row2);
		triangle.add(row3);
//		row.add(12);
//		row.add(10);
//		row.add(-12);
//		row.add(9);
		
		System.out.println(minimumTotal(triangle));
	}
}
