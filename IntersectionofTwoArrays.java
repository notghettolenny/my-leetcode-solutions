package leetcode.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionofTwoArrays {
	 public static int[] intersection(int[] nums1, int[] nums2) {
	        int len1 = nums1.length;
	        int len2 = nums2.length;
	        Arrays.sort(nums1);
	        
	        int capacity = len1>len2?len2:len1;
	        List<Integer> result = new ArrayList<Integer>(capacity);
	        
	        for(int i=0;i<len2;i++){
	            if(Arrays.binarySearch(nums1, nums2[i])!=-1&&!result.contains(nums2[i])){
	                result.add(nums2[i]);
	            }
	        }
	        int[] res = new int[result.size()];
	        for (int i=0;i<result.size();i++) {
				res[i] = result.get(i);
			}
	        return res;
	        
	    }
	 
	 public static void main(String[] args) {
		int[] nums1 = {1,2,2,3};
		int[] nums2 = {2,3,3,4};
		
	}
}
