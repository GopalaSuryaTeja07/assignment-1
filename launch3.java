package launch3;

public class launch3 {

	public static void main(String[] args) {
		int n=13;
		for(int i=0;i<=n-1;i++)
		{
			for(int j=0;j<=n-1;j++)
			{
if(i==0||i==n-1||j==0||j==n-1||i==1&&j!=6||i==2&&j!=5&&j!=6&&j!=7||i==3&&j!=5&&j!=6&&j!=7&&j!=4&&j!=8||i==4&&j!=5&&j!=6&&j!=7&&j!=4&&j!=8&&j!=3&&j!=9||i==5&&j!=5&&j!=6&&j!=7&&j!=8&j!=4&&j!=3&&j!=9&&j!=2&&j!=10)
				{
					System.out.print("*");
				}
				else
				{ 
						System.out.print(" ");
				}
			        
			}         System.out.println();
		}	
	}
}
