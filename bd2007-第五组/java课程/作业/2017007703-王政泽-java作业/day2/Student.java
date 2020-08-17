public class Student{
   public String name;
   public String gender;
   public int age;

   public Student(){

   }

   public Student(String name,String gender,int age){

	   this.name=name;
	   this.gender=gender;
	   this.age=age;
   }



   public void print(){
      System.out.println("name:"+name);
	  System.out.println("age:"+age);
	  System.out.println("gender:"+gender);
   }




}
