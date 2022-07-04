package leetcode;

public class IncreasingTripletSubsequence {
	public boolean increasingTriplet(int[] nums) {
        int small = Integer.MAX_VALUE;
        int big = Integer.MAX_VALUE;
        for(Integer num:nums){
            if(num<small){
                small = num;
            } else if(num<big){
                big = num;
            } else{
                return true;
            }
        }
        return false;
    }
}
