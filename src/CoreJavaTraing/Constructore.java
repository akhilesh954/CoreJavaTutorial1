package CoreJavaTraing;

public class Constructore {
	

	public Constructore()
	{
		System.out.println("Constriutor1");
		
	}
	public Constructore(int a)
	{
		System.out.println("Constriutor2");
	}
	public Constructore(int a, int b)
	{
		System.out.println("Constriutor4");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructore a=new Constructore();
		Constructore b=new Constructore(2);
		Constructore c=new Constructore(4,2);
	}


}