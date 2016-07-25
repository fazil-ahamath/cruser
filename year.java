import java.util.Scanner;


public class year {
	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		if((a%4)==0){
			System.out.println("given year is leap year");
		}
		else
		{
			System.out.println("not leap");
		}
	}
}
