package leetcode;

public class FirstMissingPositive {
	public int firstMissingPositive(int[] nums) {
        int k = partition(nums)+1;
        int temp=0 ;
        int index = k;
        for(int i=0;i<k;i++){
            temp = Math.abs(nums[i]);
            if(temp<=k){
                nums[temp-1] = nums[temp-1]<0?nums[temp-1]:-nums[temp-1];
            }
        }
        
        for(int i=0;i<k;i++){
            if(nums[i]>0){
                index = i;
                break;
            }
        }
        
        return index+1;
    }
    
    public int partition(int[] nums){
        int n = nums.length;
        int j = -1;
        
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                j++;
                swap(nums, i, j);
            }
        }
        
        return j;
        
    }
    
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public static void main(String[] args) {
		int[] nums = {1,2,3};
		
		FirstMissingPositive fmp = new FirstMissingPositive();
		fmp.firstMissingPositive(nums);
	}
}
