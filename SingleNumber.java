package leetcode;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
    	if(nums.length<=0){
    		return 0;
    	}
    	if(nums.length==1){
    		return nums[0];
    	}
    	int result = nums[0];
        for (int i = 1;i<nums.length;i++) {
			result ^= nums[i];
		}
        return result;
    }
    
    public static int singleNumber2(int[] nums) {
        if(nums.length<=0){
        	return 0;
        }
        int result = 0;
        int[] bits = new int[32];
        for (int i = 0; i < 32; i++) {
			for (int j = 0; j < nums.length; j++) {
				bits[i] += nums[j]>>i & 1;
//				System.out.print(bits[i] +"  ");
				bits[i] %= 3;
			}
			result |= (bits[i] << i);
		}
        return result;
    }
    
    public static void main(String[] args) {
		int[] nums = {12,34,54,65,12,34,54,12,34,54};
		System.out.println(singleNumber2(nums));
		System.out.println(Integer.toBinaryString(13));
		System.out.println(Integer.toBinaryString(13>>0&1));
		System.out.println(Integer.toBinaryString(12>>2));
		
	}
}
