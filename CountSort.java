package leetcode.sort;

public class CountSort {
	public static void sortColors(int[] nums) {
		int[] Count = { 0, 0, 0 };
		int[] result = new int[nums.length];
		int n = 0;
		for (int i = 0; i < nums.length; i++) {
			result[i] = 0;
		}
		if (nums.length <= 0) {
			return;
		}
		// 如果nums中有大于2的数
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 2) {
				n = i;
				break;
			} else{
				n = nums.length;
			}
		}
		for (int i = 0; i < n; i++) {
			if(nums[i]>2){
//				nums[i] = 2;
				Count[2] = Count[nums[2]] + 1;
			}else{
				Count[nums[i]] = Count[nums[i]] + 1;
			}
			
			
		}
		for (int i = 1; i < Count.length; i++) {
			Count[i] = Count[i] + Count[i - 1];
		}
		// System.out.println("length = "+nums.length);
		for (int j = n - 1; j >= 0; j--) {
			result[Count[nums[j]] - 1] = nums[j];
			Count[nums[j]] = Count[nums[j]] - 1;
		}
//		if(n<nums.length){
//			for (int i = n; i < result.length; i++) {
//				result[i] = nums[i];
//			}
//		}
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	public static void main(String[] args) {
		int[] nums = { 0,2,3,1 };
		int n = 0;
		// System.out.println("size = "+nums.length);
		 sortColors(nums);
		// 如果nums中有大于2的数
//		for (int i = 0; i < nums.length; i++) {
//			if (nums[i] > 2) {
//				n = i;
//				break;
//			}
//		}
//		System.out.println(n);
	}
}
