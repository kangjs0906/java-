
class Tv 
{
	boolean onOff;
	
	
	Tv() 
	{
		
	}
	
	void print() 
	{
		System.out.println("TV ������ "+onOff+"�ֽ��ϴ�.");	
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
		System.out.println("�ı⼼ô�� ������"+onOff+"�ֽ��ϴ�.");
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



