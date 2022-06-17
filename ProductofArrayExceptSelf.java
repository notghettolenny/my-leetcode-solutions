package leetcode;

public class ProductofArrayExceptSelf {
	public static  int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		
		int[] result = new int[n];
        int[] prefix = new int[n+1];
        int[] suffix = new int[n+1];
        prefix[0] =1;
        suffix[n] =1;
        for(int i=0;i<nums.length;i++){
            prefix[i+1] = prefix[i]*nums[i];
            System.out.println("prefix="+prefix[i+1]+"  "+i);
        }
        
        for(int i=n-1;i>=0;i--){
            suffix[i] = suffix[i+1]*nums[i];
        }
        
        for(int i=0;i<n;i++){
        	result[i] = prefix[i]*suffix[i+1];
        }
        return result;
    }
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		int[] result=productExceptSelf(nums);
		for (int i : result) {
			System.out.println(i);
		}
	}
}
