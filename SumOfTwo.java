import java.util.*;
class SumOfTwo
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter two number to be added .. ");
	int x=sc.nextInt();
	int y=sc.nextInt();

	System.out.println(SumOfTwo.doSum(x,y));
	System.out.println(SumOfTwo.sumOfRange(x,y));

	}

	static int doSum(int a,int b)
	{
	int sum=a+b;
	return sum;
	}

	static int sumOfRange(int a,int b)
	{
		int sum=0;
		for(int i=a;i<=b;i++)
		{
			sum=sum+i;
		}

		return sum;
	}
}