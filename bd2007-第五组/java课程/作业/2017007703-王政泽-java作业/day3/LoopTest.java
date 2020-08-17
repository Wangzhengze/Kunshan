public class LoopTest{
   public static void main(String[] args){
      LoopTest l = new LoopTest();
	  l.whileTest();
	  l.doTest();
   }


   public void whileTest(){
    int i=1;
	int sum = 1;
     while(i<10){
       	System.out.print(i+"X");
		i++;
		sum*=i;
	 }
	 System.out.println("="+sum);
   }
  public void doTest(){
      int i = 0;
	  do{
       System.out.print(i+"*");
	   i++;

	}while(i<10);

  }

}
