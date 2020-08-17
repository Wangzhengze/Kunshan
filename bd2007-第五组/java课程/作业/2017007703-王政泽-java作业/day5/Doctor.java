public class Doctor{
   private String name;
   private String department;
   private String tel;
   public Doctor(String name,String department,String tel){
	   this.name=name;
	   this.department=department;
	   this.tel=tel;

   }

   public String getName(){
      return name;
   }

   public void setName(String name){
      this.name=name;
   }


}
