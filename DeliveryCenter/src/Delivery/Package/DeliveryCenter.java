package Delivery.Package;

public class DeliveryCenter {
	int t ;
	public DeliveryCenter(int t, int x1, int x2, int y1, int y2) {
	 
	  
	}

	public static void main(String[] args)
	{
	DeliveryCenter center = new DeliveryCenter(100,20,20,10,30);
	center.add(new Delivery(10, 28, 1));
	center.add(new Delivery(10, 31, 2));
	center.add(new Delivery(40, 30, 3));
	center.add(new Delivery(19, 22, 4));
	center.add(new Delivery(20, 21, 5));
	System.out.println("*******\n Init the delivery Center:\n");
	System.out.println(center);
	System.out.println("Find the closest from the 1st center");
	System.out.println(center.getClosest(1));
	Delivery deli = center.removeClosest(1);
	System.out.println("Find the closest from the 2nd center");
	System.out.println(center.getClosest(2));
	deli= center.removeClosest(2);
	System.out.println("********\n After the changes:");
	System.out.println(center);
	}

	private char[] getClosest(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private Delivery removeClosest(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private void add(Delivery delivery) {
		// TODO Auto-generated method stub
		
	}
	
	}

