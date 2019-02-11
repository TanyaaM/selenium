package selenium;

public class Arrays {

	public static void main(String[] args) {
		String Str[]= new String[4];
		
		Str[0]="hello";
		Str[1]="name";
		Str[2]="phone";
		Str[3]="digits";
		
		System.out.println(Str.length); 
		
		for(int t=0;t<Str.length;t++)
		{
			System.out.println(Str[t]);	
		}
		//two dimensional array
		
		String x[][]= new String[3][4];
		
		x[0][0]="A";
		x[0][1]="B";
		x[0][2]="C";
		x[0][3]="D";
		
		x[1][0]="A1";
		x[1][1]="B1";
		x[1][2]="C1";
		x[1][3]="D1";
		
		x[2][0]="A2";
		x[2][1]="B2";
		x[2][2]="C2";
		x[2][3]="D2";
		
	System.out.println("Rows are="+ x.length);	
	System.out.println("Cols are="+ x[0].length);
	
	int rows=x.length;
	int cols=x[0].length;
	
	for(int rowNum=0;rowNum<rows;rowNum++)
	{
		for(int colsNum=0;colsNum<cols;colsNum++)
		{
			System.out.println(x[rowNum][colsNum]+"");
		}
	}
		}
		
}
