import java.util.ArrayList;

	public class TransportSim {

	  private ArrayList<Vehicle> vehicles; 
	  private ArrayList<String> kindsOfVehicles = new ArrayList<String>();
	  
	  public TransportSim(ArrayList<Vehicle> r) //constructor
	  {  
		  vehicles = r;
		  for(Vehicle a : vehicles) {
			  kindsOfVehicles.add(a.getClass().getName());
		  }
	  }
	  
	  
	  public int count(ArrayList<String> List, String betaString) 
	  {
			int count = 0;
			for(String a : List) 
			{
				if(a.equals(betaString)) 
				{
					count += 1;
				}
			}
			return count;
		}
	  
	  
	  public void addVehicle(Vehicle v) // 
	  {
	     vehicles.add(v);
	     kindsOfVehicles.add(v.getClass().getName());
	  }

	  
	  public void loadTrucks(String item)
	  {  
		  for(Vehicle a : vehicles) 
		  {
			  if(a instanceof Truck)
			  {
				  ((Truck) a).load(item);
			  }
		  } 
	  }

	  
	  public void step()
	  {
	    //instruct all vehicles in the simulation to move once 
		  for(Vehicle a : vehicles)
		  {
			  a.move();
		  }
	  }
	  
	  
	  public void run(int steps)
	  {
	    //run the simulation 'steps' times 
		  for(int i = 0; i< steps; i++)
		  {
			  for(Vehicle a :vehicles)
			  {
				  a.move();
			  }
		  }
	  }

	  
	  public String toString()
	  {
	    //gives info about vehicles and sorts them
		  
	    String allVehicleInfo = "";
	    for(Vehicle a : vehicles)
	    {
	    	if(a instanceof Auto)
	    	{
	    		allVehicleInfo = allVehicleInfo + ((Auto) a).toString();
	    	}
	    	if(a instanceof Truck)
	    	{
	    		allVehicleInfo = allVehicleInfo + ((Truck) a).toString();
	    	}
	    }
	    int numOfAuto = count(kindsOfVehicles, "Auto");
		int numOfTruck = count(kindsOfVehicles, "Truck");
		int numOfBicycle = count(kindsOfVehicles, "Bicycle");
		allVehicleInfo = "Number of Vehicles: "+vehicles.size()+"\n"
		  		+ "Autos: "+numOfAuto+", Trucks: "+numOfTruck+", Others: "+numOfBicycle;
	    return allVehicleInfo;
	  }
	} 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	