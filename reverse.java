package reverse1;

public class reverse {
	int rever()
	{
	int j;
	String str="12322342";
	StringBuffer ob=new StringBuffer(str);
	j=Integer.parseInt(ob.reverse().toString());
	return j;
 }
	public static void main(String[] args) {
	 reverse r=new reverse();
	System.out.println(r.rever());
	 
}
}