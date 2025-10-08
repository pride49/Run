import java.util.*;

class Slip1Question1 {

	public static void main(String[] args) {

		System.out.println("Prime numbers in the array:");
		
		int arr[] = new int[args.length];

		for (int i = 0; i < args.length; i++) 
		{
			int num = Integer.parseInt(args[i]);
			
			if (isPrime(num))
			{
				System.out.print(num + " ");
				arr[i]=num;
			}
		}
		
	}

	private static boolean isPrime(int n) 
	{
		if (n <= 1) 
		{
			return false;
		}
		for (int i = 2; i <= n / 2; i++) 
		{
			if (n % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
