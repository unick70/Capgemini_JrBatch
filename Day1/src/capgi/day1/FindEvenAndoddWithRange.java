package capgi.day1;

public class FindEvenAndoddWithRange {
	//need to find odd and even between 1 to 100
	
public static void main(String[] args)
{
	for (int i=1;i<=100;i++)
	{
		if(i==10)
		{
			continue;
		}
		
		if(i%2==0)
		{
			System.out.println("Even"+i);
			}
		else 
		{
			System.out.println("odd"+i);
		}
}
}
}
