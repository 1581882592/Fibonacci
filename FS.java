
public class FS {
public static void main(String[] args)
{
	for(int i=1;;i++)
	{
		int temp=Fibonacci.of(i);
		if(temp<200)
			System.out.println(temp);
		else
			break;
	}
	}


public static class Fibonacci
{
	public static int of(int n)
	{
		if(n==1||n==2)
			return 1;
		else if(n>2)
		{
			int a=1,b=1,temp=0;
			for(int i=0;i<n-2;i++)
			{
				temp=a+b;
				a=b;
				b=temp;
			}
			return temp;
		}
		else
			return -1;
		}
	}
}
