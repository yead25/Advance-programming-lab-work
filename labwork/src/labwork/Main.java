package labwork;


public class Main {
	
	
	
	static public void do_something(Vehicle ...v) 
	{
		for(int i=0;i<v.length;i++)
		{
			System.out.println("This is ->  ");
			if(v[i] instanceof Car)
			{
				((Car)v[i]).name();
				
			}
			else if(v[i] instanceof Bus)
			{
				((Bus)v[i]).name();
			}
			else if(v[i] instanceof Ship)
			{
				((Ship)v[i]).name();
				
			}
			else if(v[i] instanceof Boat)
			{
				((Boat)v[i]).name();
				
			}
			else if(v[i] instanceof Aeroplane)
			{
				((Aeroplane)v[i]).name();
				
			}
			else if(v[i] instanceof Helicopter)
			{
				((Helicopter)v[i]).name();
			}
			
			
		}
	}

	public static void main(String[] args) {
		
		Vehicle car =new Car();
		
		car.speed();
		car.is_running();
		Vehicle bus=new Bus();
		bus.speed();
		bus.is_running();
		Vehicle boat=new Boat();
		boat.speed();
		boat.is_running();
		Vehicle helicopter =new Helicopter();
		helicopter.speed();
		helicopter.is_running();
		Vehicle ship=new Ship();
		ship.speed();
		ship.is_running();
		Vehicle aeroplane=new Aeroplane();
		aeroplane.speed();
		aeroplane.is_running();
		
	do_something(car,ship,bus,helicopter,boat,aeroplane);
	
		
		Car c=new Car();
		Land l=new Car();
		c.speed();
		l.speed();
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		

	}

}
