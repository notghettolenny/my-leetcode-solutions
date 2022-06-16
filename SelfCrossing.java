package leetcode;

public class SelfCrossing {
	public static boolean isSelfCrossing(int[] x) {
		boolean isCrossing = false;
		if (x.length <= 3) {
			isCrossing = false;
		} else {
			for (int i = 3; i < x.length; i++) {
				if (x[i - 3] >= x[i - 1] && x[i - 2] <= x[i]) {
					isCrossing = true;
				}
				if (i >= 4) {
					if (x[i - 1] == x[i - 3] && x[i] + x[i - 4] >= x[i - 2]) {
						isCrossing = true;
					}
				}
				if(i>=5){
					if(x[i-2]-x[i-4]>=0 && x[i-2]-x[i-4]<=x[i] && x[i-3]-x[i-5]<=x[i-1] && x[i-3] >=x[i-1]){
						isCrossing = true;
					}
				}
			}
		}
		return isCrossing;
	}
	
	public static void main(String[] args) {
		int[] x ={1,1,2,1,1};
		System.out.println(isSelfCrossing(x));
//		int
	}
}
