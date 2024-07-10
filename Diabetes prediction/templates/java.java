import java.util.*;
class SOlution
{
	static int c=0;
	static void find1(int i,int k,int a[],int n,int s)
	{
		if(s%k==0)
			c+=1;
		for(int j=i+1;j<n;j++)
		{
			s+=a[j];
			find1(j,k,a,n,s);
			s-=a[j];
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			find1(i,a[0],a,n,a[i]);
		}
		System.out.print(c);
	}
}