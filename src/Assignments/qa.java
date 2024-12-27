package Assignments;

 public class qa {
	
		// Static variables to store employee names and IDs
	     String[] names = {"Bharath", "ABC", "XYZ"};
	     int[] ids = {1234, 1235, 1236};
	}
		 

 class Emp {
	
	 static String[] employeeNames = new String[3];
     static int[] employeeIds = new int[3];
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		qa obj =new qa();
		employeeNames=obj.names;
		employeeIds=obj.ids;
	
		System.out.println(employeeNames);
	
	}

}
