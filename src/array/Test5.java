package array;

public class Test5 {

	public static void main(String[] args) {
		
		String players[][]=new String[3][2];
		
		players[0][0]="Rohit ";
		players[0][1]="Ishan ";
		players[1][0]="Virat ";
		players[1][1]="Surya ";
		players[2][0]="Shreyash";
		players[2][1]="Tilak ";
		
		//rows -->3-->0,1,2
		//columns-->2-->0,1
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=1;j++) 
			{
		      System.out.print(players[i][j]+" ");
			}
			System.out.println();
		}
	}

}
