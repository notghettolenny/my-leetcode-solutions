package leetcode;

public class SortColors {
	public static void sortColors(int[] nums) {
		if(nums.length<2){
			return ;
		}
		int low = 0,i=0,high=nums.length-1;
		while(i<=high){
			if(nums[i]==0){
				int temp = nums[i];
				nums[i] = nums[low];
				nums[low] = temp;
				i++;
				low++;
			} else if(nums[i]==1){
				i++;
			} else{
				int temp = nums[i];
				nums[i] = nums[high];
				nums[high] = temp;
				high--;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] nums = {0,2,-3,1};
		sortColors(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
	
}
