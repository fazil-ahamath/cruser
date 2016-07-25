import java.util.Scanner;


public class natural {
	public static void main(String[] args) {
		int n;
		int t = 0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++){
			t=t+i;
		}
		System.out.println(t);
	}
}
