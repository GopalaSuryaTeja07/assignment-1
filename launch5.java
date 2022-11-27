package launch5;

public class launch5 {

	public static void main(String[] args) {
		int n=10;
		for(int i=0;i<=n-1;i++)
		{
			for(int j=0;j<=n-1;j++)
			{
				if(i==0||i==n-1||j==0||j==1&&i==(n-1)/2||i==1&&j<(3*n)/4||i==2&&j<=(n-1)/2||i==3&&j<=(1*n)/4||i==9&&i!=(n-1)/2||i==8&&j<(3*n)/4||i==7&&j<=(n-1)/2||i==6&&j<(1*n)/4&&j!=2)
				{ 
					System.out.print("*");
				}
			else 
			{
		         System.out.print( " ");
			}
		  } System.out.println( );
		}	
	}

}
