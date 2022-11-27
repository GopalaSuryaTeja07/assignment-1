package launch4;

public class launch4 {

	public static void main(String[] args) {
		int n=8;
		for(int i=0;i<=n-1;i++)
		{
			for(int j=0;j<=n-1;j++)
			{
			if(j<=i||j>=n-i-1)
				{
				System.out.print("*");
				}
				else
			      {
					System.out.print(" ");
			      }
			       }System.out.println();
	        }
		}
    }
