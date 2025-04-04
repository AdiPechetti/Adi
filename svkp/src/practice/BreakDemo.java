package practice;
public class BreakDemo 
{
	public static void main(String[] args)
	{
		for(int i=1;i<999;i++)
		{
			if(i>99)
			{
				break;
			}
			System.out.println(i);
		}
	}
}