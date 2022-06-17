package leetcode;

public class PowerOfFour {
	 public boolean isPowerOfFour(int num) {
	        if(num==0){
	            return false;
	        }
	        if(num==1){
	            return true;
	        }
	        int num2 = num&0x55555554;
	        int num3 = num&(num-1);
	        if(num2==num&&num3==0){
	            return true;
	        } else{
	            return false;
	        }
	    }
}
