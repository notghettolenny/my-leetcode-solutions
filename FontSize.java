package leetcode;

import java.util.Scanner;

public class FontSize {
	public static int fontSize(int[] nums, int pages, int width, int height){
		int total = 0;
		int size = 0;
		for (int i = 0; i < nums.length; i++) {
			total += nums[i];
		}
		
		size = (int) Math.sqrt(pages*width*height/total);
		return size;
	}
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int tests = in.nextInt();
		while(in.hasNext()){
			
			int N = in.nextInt();
			int[] nums = new int[N];
			int page = in.nextInt();
			int width = in.nextInt();
			int height = in.nextInt();
			for (int i = 0; i < N; i++) {
				nums[i] = in.nextInt();
			}
			System.out.println(fontSize(nums, page, width, height));
		}
		
		
				
	}
}
