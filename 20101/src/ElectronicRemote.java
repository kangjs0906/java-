
class Tv 
{
	boolean onOff;
	
	
	Tv() 
	{
		
	}
	
	void print() 
	{
		System.out.println("TV 전원은 "+onOff+"있습니다.");	
	}
}

class Diswash
{
	boolean onOff;
	
	Diswash() 
	{
		
	}
	
	void print()
	{
		System.out.println("식기세척기 전원은"+onOff+"있습니다.");
	}
}


public class ElectronicRemote 
{

	public static void main(String[] args) 
	{
		
	Tv myTv = new Tv();	
	Diswash mydis1 = new Diswash();
	
	mydis1.onOff=false;
	myTv.onOff=true;
	
	mydis1.print();
	myTv.print();
	
	}

}



