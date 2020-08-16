import java.util.Scanner;
import java.util.Arrays;
public class Test1 {

   public static void main(String[] args){

     Scanner sc = new Scanner(System.in);
	 int num = sc.nextInt();
	 int[] arr = new int[9];
	 Arrays.fill(arr,6);
	 for(int i=0;i<arr.length;i++){
       if(i+1 == num){
          arr[i] = num;
	   }
	   System.out.print(arr[i]);

	 }
   }

}
