import java.util.*;
import java.io.*;

class element
{
 public static void main(String[] args)
 {
   int count=0;
   System.out.println("ENTER THE NUMBER OF ELEMENTS IN ARRAY: ");
   Scanner s=new Scanner(System.in);
   int n=s.nextInt();
   int[] Arr=new int[n];
   element obj=new element();
   System.out.println("ENTER THE ELEMENTS:");
   for(int i=0;i<n;i++)
    {
     Arr[i]=s.nextInt();
    }
    Arrays.sort(Arr);
    //for(int o:Arr)
   // System.out.println(o);
   System.out.println("UNIQUE ELEMENT:"+obj.method(Arr,n));
 } 
 public int method(int[] Arr,int n)
   {
     int temp=0,count=0;
    for(int i=0;i<n-1;i+=2)
     {
       if(Arr[i]!=Arr[i+1])
         {  
          temp=Arr[i];
          count=1;
          break;
         }
    }
    if(count==0)
    {
    temp=Arr[Arr.length-1];
    }
      return temp;
  }}