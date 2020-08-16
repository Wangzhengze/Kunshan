package com.briup.day09;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "阿牛哥");
        map.put(4, "灭绝师太");
        
        /*Set<Integer> key = map.keySet();
        for (Integer integer : key) {
			System.out.println(integer+":"+map.get(integer));
		}
*/      
        
        Set<Entry<Integer, String>> entrySet = map.entrySet();
        for (Entry entry : entrySet) {
			System.out.println(entry);
		}
        
        map.put(5, "李晓红");
        map.remove(1);
        map.put(2, "赵敏");
        System.out.println(map);
        
	}

}
