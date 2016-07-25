import java.util.Scanner;


public class posi {
	public static void main(String[] args) {
	int a;
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	if(a>0){
		System.out.println("Given number is positive");
		
	}
	else if(a<0){
		System.out.println("Given number is negative");
	}
	else{
		System.out.println("it is zero");
		
	}
}
}
