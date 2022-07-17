package leetcode.sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionofTwoArraysII {
	public int[] intersect(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        List<Integer> result = new ArrayList<>();
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<len1;i++){
            Integer freq = map.get(nums1[i]);
            map.put(nums1[i],freq==null?1:freq+1);
        }
        
        for(int i=0;i<len2;i++){
            Integer freq1 = map.get(nums2[i]);
            if(freq1!=null && freq1>0){
                result.add(nums2[i]);
                map.put(nums2[i],freq1-1);
            }
        }
        
        int[] res = new int[result.size()];
        for(int i=0;i<result.size();i++){
            res[i] = result.get(i);
        }
        
        return res;
}
}
