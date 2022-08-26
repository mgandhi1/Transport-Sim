public abstract class Vehicle // every class extends class "Object"
{
	private int position;
	private int speed;
	
	public Vehicle(int p, int s)
	{
		position = p;
		speed = s;
	}
	
	public void move()
	{
		position += speed;
	}
	
	public abstract int getTopSpeed(); // this is just a header 
	
	public String toString()
	{
		return "Position: " + position + " Speed: " + speed;
	}
}