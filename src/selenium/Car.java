package selenium;

public class Car {

String mod;//declare variables
int price;
static int wheels=4;


//declare functions

public void start(){
	System.out.println(mod +"--"+"starting");
}
public void start(String Key){
	System.out.println(mod +"=--"+"");
	}
public void accel(){
	System.out.println(mod ="--"+"accelerating");
}
public void gasfill(){
	System.out.println(mod +"--"+"gasfill");
}
	public Car()//constructor
	{
		start();//calling of function
	}
	public Car(String mod1, int price1)
	{
		mod=mod1;
		price=price1;
	}


}

	
