package com;

public class TestDriver {
	public static void main(String[] args) {
		Driver[] drivers= {
				new Driver(1,"srinu","van",4200),
				new Driver(2,"keshav","car",3000),
				new Driver(3,"vamsi","auto",6000),
				new Driver(4,"sai","car",5500),
		};
		
		Travel travel=new Travel();
		// CHECK CAR DRIVER
		
		System.out.println("Is car Driver:"+travel.isCarDriver(drivers[1]));
		
		// RETRIEVE BY DRIVERID
		
		System.out.println(travel.retrieveByDriverId(drivers, 1));
		
		// COUNT OF DRIVERS BY CATEGORY
		
		System.out.println(travel.retrieveCountOfDriver(drivers, "car"));
		
		// RETRIEVE DRIVERS BY CATEGORY
		
		Driver[] carDrivers=travel.retrieveDriver(drivers, "car");
		System.out.println("car drivers list:");
		for(Driver d:carDrivers) {
			System.out.println(d.getDriverName()+" "+d.getCategory()+" "+d.getTotalDistance());
		}
		
		// DRIVER WHO TRAVEL MAXDISTANCE
		
		Driver maxdriver=travel.retrieveMaximumDistanceTravel(drivers);
		System.out.println("maximum distance travel "+maxdriver.getDriverName());
		
		
	}

}
