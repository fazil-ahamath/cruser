package summa;
import java.util.Scanner;
public class summa {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int j=num;
		int b=0;
		  while(num!=0)
		 {
			 int a =num%10;
			 //System.out.println(a);
			 int k =a*a*a;
			  b =k+b;
			 num=num/10;
			 }
		 System.out.println(b);
		  if(b==j)
		  {
			 System.out.println("the given number is armstrong");
		 }
		 else
		 {
			 System.out.println("the given number is not armstrong");
		 }
}
}