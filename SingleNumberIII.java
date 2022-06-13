package leetcode;

public class SingleNumberIII {
	public int[] singleNumber(int[] nums) {
        int[] result = new int[2];
        
        int flag = 0;
        int bitPlace = -1;
        for(int i=0; i<nums.length;i++){
            flag ^=nums[i];
        }
        
        for(int j =0;j<32;j++){
            int bit = flag>>j&1;
            if(bit>0){
                bitPlace = j;
                break;
            }
        }
        
        // System.out.println(bitPlace);
        
        for(int i=0;i<nums.length;i++){
            int bit = nums[i]>>(bitPlace)&1;
            if(bit>0){
                result[0] ^= nums[i];
            } else{
                result[1] ^= nums[i];
            }
        }
        return result;
    }
}
