public class StudentTest{
  public static void main(String[] args){

    Student s1 = new Student(1,"tom",79);
    Student s2 = new Student(2,"jack",87);
    Student s3 = new Student(3,"lily",90);
    Student s4 = new Student(4,"bob",88);
    Student s5 = new Student(5,"alies",90);
	Student[] stu = new Student[]{s1,s2,s3,s4,s5};
	int sum = 0;
	int avg = 0;
	for(int i=0;i<stu.length;i++){
       sum+=stu[i].getScore();
	}
	avg = sum/stu.length;
	System.out.println("学生的平均成绩为："+avg);
  

  for(int j=0;j<stu.length;j++){
     if((stu[j].getScore()) < avg){
       System.out.println("低于平均成绩的学生："+stu[j].getName());
	 }
  }
 }

}
