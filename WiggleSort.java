package leetcode;

import java.util.Collections;

public class WiggleSort {
	public static void wiggleSort(int[] nums) {
		int temp[] = new int[nums.length];
        if(nums.length<2){
        	return ;
        }
        
        for (int i = 0; i < nums.length; i++) {
//			System.out.println(nums[i]);
			temp[i] = nums[i];
		}
        quickSort(temp, 0, temp.length-1);
        
//        int mid = nums.length/2;
//        if(nums.length%2!=0){
//        	mid++;
//        }
//        
//        int low = mid-1;
//        int high = nums.length-1;
//        for (int i = 0; i < temp.length; i++) {
//			if(i%2==0){
//				nums[i] = temp[low];
//				low--;
//			} else{
//				nums[i] = temp[high];
//				high--;
//			}
//		}
        
        int index = temp.length-1;
        for (int i = nums.length-1; i >=0; i=i-2) {
			nums[i] = temp[index];
			index--;
		}
        
        for (int j = nums.length-2; j >=0; j=j-2) {
			nums[j] = temp[index];
			index--;
		}
        
        for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
        
    }
	
	public static void quickSort(int[] nums, int start, int end){
//		int[] result = new int[nums.length];
		
		if(start<end){
			int q = partition(nums, start, end);
			quickSort(nums, start, q-1);
			quickSort(nums, q+1, end);
		}
	}

	private static int partition(int[] nums, int start, int end) {
		int pivot = nums[end];
		int i = start-1;
		for (int j = start; j < end; j++) {
			if(nums[j]<=pivot){
				i++;
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}
		}
		int temp = nums[end];
		nums[end] = nums[i+1];
		nums[i+1] = temp;
		
		return i+1;
	}
	
	public static void main(String[] args) {
		int nums[] = {1,5,1,1,6,4};
		wiggleSort(nums);
	}
}
