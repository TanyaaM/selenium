package selenium;

public class Object1 {

	public static void main(String[] args) {
		
Object obj[]= new Object[4];
		
		
		obj[0]="Hello";
		obj[1]=1234;
		obj[2]=true;
		obj[3]="Digits";
		
			
		System.out.println(obj.length);
		
		for(int x=0;x<obj.length;x++)
		{
			System.out.println(obj[x]);
		}
	}

}
