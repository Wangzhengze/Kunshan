package com.briup.day09;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student("zs1","jd1501",86);
		Student s2 = new Student("zs2","jd1501",85);
		Student s3 = new Student("zs3","jd1501",70);
		Student s4 = new Student("zs4","jd1501",82);
		Student s5 = new Student("zs5","jd1501",65);
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		int sum = 0;
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			int score = s.getScore();
			sum+=score;
		}
		System.out.println("班级总分："+sum);
		System.out.println("班级的平均成绩："+sum/list.size());
	}

}
