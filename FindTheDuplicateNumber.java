package leetcode;

import java.util.Arrays;

public class FindTheDuplicateNumber {
	/**
	 * 打乱了nums数组的顺序，不符合题意
	 * @param nums
	 * @return
	 */
	public int findDuplicate(int[] nums) {
		if(nums.length<=0){
			return -1;
		}
		Arrays.sort(nums);
		int pre = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if(nums[i]==pre){
				return nums[i];
			} else{
				pre = nums[i];
			}
		}
		return -1;
	}
	
	public int findDuplicate2(int[] nums) {
		if (nums.length == 0 || nums == null)
	        return 0;
	    int low = 1, high = nums.length - 1, mid;
	    while (low < high) {
	        mid = low + (high - low) / 2;
	        int count = 0;
	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] <= mid)
	                count++;
	        }
	        if (count > mid)
	            high = mid;
	        else
	            low = mid + 1;
	    }
	    return low;
	}
	
	
	public static void main(String[] args) {
	}
}
