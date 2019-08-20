import java.util.*;
class max
{
public static void main(String argS[])
{
int i,a;
Scanner sc=new Scanner(System.in);
System.out.println("enter the no");
a=sc.nextInt();
int n []=new int[a];
for(i=0;i<a;i++)
{
n[i]=sc.nextInt();
}
int b[]=new int[n.length];
int max=n[0];
for(i=1;i<n.length;i++)
{
	if(n[i]>max)
	{
		max=n[i];
	
	}
}
System.out.println(""+max);

}}
