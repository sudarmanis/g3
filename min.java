import java.util.*;
class min
{
public static void main(String argS[])
{
int i,a;
Scanner sc=new Scanner(System.in);
System.out.println("enter the mul no");
a=sc.nextInt();
int n []=new int[a];
for(i=0;i<a;i++)
{
n[i]=sc.nextInt();
}

int min=n[0];
for(i=1;i<n.length;i++)
{
	if(n[i]<min)
	{
		min=n[i];
	
	}
}
System.out.println(""+min);

}}
