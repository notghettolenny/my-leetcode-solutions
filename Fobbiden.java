package leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Fobbiden {
	private static final String ALLOW = "allow";
	private static final String DENY = "deny";
	private static final String YES = "YES";
	private static final String NO = "NO";
	
//	public static String isAllowed(String key){ 
//		if(key.equals(ALLOW)){
//			return YES;
//		} else{
//			return NO;
//		}
//	}
	
	public static String whichIsAllow(HashMap<String, String> ipMap, String ip){
		Iterator entries = ipMap.entrySet().iterator();
		while(entries.hasNext()){
			Map.Entry entry = (Map.Entry) entries.next();
			
			String key = (String) entry.getKey();
			String value = (String) entry.getValue();
			if(ip.equals(key)){
				return value;
			}
			
		}
		return YES;
	}
	
	
}
