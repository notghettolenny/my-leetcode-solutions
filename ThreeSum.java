package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSum {
	/**
	 * 暴力解法，时间复杂度为O(n^3)
	 * @param nums
	 * @return
	 */
	public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        
        for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				for (int k = j+1; k < nums.length; k++) {
					if(nums[i]+nums[j]+nums[k]==0){
						Integer[] temp = {nums[i],nums[j],nums[k]};
						List<Integer> result = new ArrayList<>(Arrays.asList(temp));
						Collections.sort(result);
						if(!results.contains(result)){
							results.add(result);
						}
					}
				}
			}
		}
        return results;
	}
	
	/**
	 * 时间复杂度O(n^2)
	 * @param nums
	 * @return
	 */
	 public List<List<Integer>> threeSum2(int[] nums) {
	        List<List<Integer>> results = new ArrayList<>();
	        
	        Arrays.sort(nums);
	        
	        for(int i=0;i<nums.length-1;i++){
	              if(i==0 || i>0 && nums[i]!=nums[i-1]){
	                  int low = i+1;
	                  int high = nums.length-1;
	                  int target = 0-nums[i];
	                  while(low<high){
	                      if(nums[low]+nums[high]==target){
	                          results.add(Arrays.asList(nums[i],nums[low],nums[high]));
	                          while(low<high && nums[low]==nums[low+1]) low++;
	                          while(low<high && nums[high]==nums[high-1]) high--;
	                          low++;
	                          high--;
	                      } else if(nums[low]+nums[high]>target){
	                          high--;
	                      } else{
	                          low++;
	                      }
	                  }
	              }             
	        }
	        return results;
	    }
	
	public static void main(String[] args) {
		int[] nums = {-1,0,1,2,-1,-4};
		List<List<Integer>> result = threeSum(nums);
		for (List<Integer> list : result) {
			for (Integer integer : list) {
				System.out.print(integer+", ");
			}
			System.out.println();
		}
	}
}
