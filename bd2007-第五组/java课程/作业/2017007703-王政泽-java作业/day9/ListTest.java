package com.briup.day09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List list = new ArrayList();
		//添加
		list.add("abc");
		list.add(12);
		list.add(2);
		list.add("bbb");
		list.add("你好");
		
		//移出
		//list.remove(0);
		
		//修改
		list.set(1, 1);
		System.out.println(list);
		
		//遍历
		/*Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		for (Object object : list) {
			System.out.println(object);
		}
	}

}
