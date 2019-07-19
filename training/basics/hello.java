package training.basics;
/**
 * 
 * @author himsingh4
 *
 */
public class hello {
	public static void main(String[] args) {
		int a=10,b=2,c=1552;
		int a1=20,b1=3,c1=1887;
		int count=0;
		for(int i=c;i<c1;i++)
		{
			if(i%4==0&&i%400==0)
			{
				count=count+366;
			}
			else
			{
				count=count+365;
			}
		}
		for(int i=b;i<b1;i++)
		{
			if(b%2==1)
			{
				count=count+(31);
			}
			else
			{
				if(b==2)
				{
					if(c1%4==0&&c1%400==0) {
						count=count+(29-a);
					}
					else
					{
						count=count+(28-a);
					}
				}
				else
				{
					count=count+(30-a);
				}
			}
		}
		if(b%2==1)
		{
			count=count+(31-a);
		}
		else
		{
			if(b==2)
			{
				if(c%4==0&&c%400==0) {
					count=count+(29-a);
				}
				else
				{
					count=count+(28-a);
				}
			}
			else
			{
				count=count+(30-a);
			}
		}
	}

}
