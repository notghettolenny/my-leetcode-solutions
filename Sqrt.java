package leetcode;

public class Sqrt {
	public int mySqrt(int x) {
        if(x<0){
            return x;
        }       
       long r = x;
       while(r*r>x){
           r = (x/r+r)/2;
       }
       return (int)r;
    }
}
