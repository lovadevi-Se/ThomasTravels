package com;

public class Travel {
	
	public boolean isCarDriver(Driver driver) {
		return driver.getCategory().equalsIgnoreCase("car");
	}
	
	public String retrieveByDriverId(Driver[] drivers,int driverId) {
		for(Driver d:drivers) {
			if(d.getDriverId()==driverId) {
				return "Driver name is"+ d.getDriverName()+"beloning to"+d.getCategory()+"travelled"+
			            d.getTotalDistance()+"KM so far.";
			}
		}
		return "Driver not found";
	}
	
	
   public int retrieveCountOfDriver(Driver[] drivers,String category) {
	   int count=0;
	   for(Driver d:drivers) {
		   if(d.getCategory().equalsIgnoreCase(category)) {
		   count++;
	   }
   }
   return count;
	}
   
   public Driver[] retrieveDriver(Driver[] drivers,String category) {
	   int count=retrieveCountOfDriver(drivers,category);
	   Driver[] result=new Driver[count];
	   int index=0;
	   for(Driver d:drivers) {
		   if(d.getCategory().equalsIgnoreCase(category)) {
			   result[index++]=d;
		   }
	   }
	   return result;
   }
   
   public Driver retrieveMaximumDistanceTravel(Driver[] drivers) {
	   Driver maxDriver=drivers[0];
	   for(Driver d:drivers) {
		   if(d.getTotalDistance()>maxDriver.getTotalDistance()) {
			   maxDriver=d;
		   }
	   }
	   return maxDriver;
   }
}

