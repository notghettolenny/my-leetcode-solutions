package leetcode;

public class SingleNumberII {
	 public int singleNumber(int[] nums) {
	        int result = 0;
	        int[] bits = new int[32];
	        
	        for(int i=0;i<32;i++){
	            for(int j = 0;j<nums.length;j++){
	                bits[i] += nums[j]>>i&1;
	                bits[i] = bits[i]%3;
	            }
	            result += bits[i]<<i;
	        }
	        return result;
	    }
}
