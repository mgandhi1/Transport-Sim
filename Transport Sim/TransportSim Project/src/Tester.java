import java.util.ArrayList;

public class Tester
{
	
	
	
	public static void main(String[] args)
	{
		Auto a = new Auto(10,20,30);
		Truck t = new Truck(10,20,30);
		
		Vehicle v = new Auto(1,2,3);
		v.move();
		System.out.println(v);
		
		
	}
}
