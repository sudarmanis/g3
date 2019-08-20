import java.util.*;
class arrmin
{
public static void main(String argS[])
{
int i,a,t=0,j;
Scanner sc=new Scanner(System.in);

a=sc.nextInt();
int n []=new int[a];
for(i=0;i<a;i++)
{
n[i]=sc.nextInt();
}
for(i=0;i<n.length;i++)
{
	for( j=1;j<n.length;j++)
	{
		if(n[i]>n[j])
		{
			t=n[i];
			n[i]=n[j];
			n[j]=t;
		}
	}
}

System.out.println();
for(i=0;i<n.length;i++)
{
System.out.print(n[i]+" ");
}
}}
