import java.util.Scanner;


public class large {
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b){
			System.out.println(a);
		}
		else if(b>c){
			System.out.println(b);
			
		}
		else if(a<c)
		{
			System.out.println(c);
		}
		
	}

}
