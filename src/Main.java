import java.util.*;
import java.math.BigInteger;
import java.util.concurrent.*;
import java.math.*;

public class Main
{
	public static void main(String[] args)
	{
		while (true)
		{
			System.out.println("Input:");
			//
			int a=1;
			Scanner scanner = new Scanner(System.in); 
			a = scanner.nextInt();
			BigInteger b=new BigInteger("1");
			for (int i=1;i <= a;i++)
			{
				BigInteger t=new BigInteger(String.valueOf(i));
				b = b.multiply(t);
			}
			System.out.println(b.toString());
		}
	}
}
