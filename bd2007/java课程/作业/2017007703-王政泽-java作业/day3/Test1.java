import java.util.Scanner;
public class Test1{
   public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
	int i = num/10;
	switch(i){
      case 0:
	  case 1:
	  case 2:
	  case 5:
	  case 3:
	  case 4:
		  System.out.println("成绩不合格");
		  break;
	  case 6:
		  System.out.println("成绩及格");
		  break;
	  case 7:
		  System.out.println("成绩中等");
		  break;
	}
   }


}
