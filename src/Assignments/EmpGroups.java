package Assignments;


//Array and object Assignment

public class EmpGroups {
	
	   static String[] employeeNames = new String[3];
       static int[] employeeIds = new int[3];
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employees obj=new Employees();
		employeeNames=obj.names;
		employeeIds=obj.ids;

		System.out.println("Employee Name: " +  employeeNames[0] + ", Employee ID: " + employeeIds[0]);
		System.out.println("Employee Name: " +  employeeNames[1] + ", Employee ID: " + employeeIds[1]);
        System.out.println("Employee Name: " +  employeeNames[2] + ", Employee ID: " + employeeIds[2]);
        
        
     //using for loop    
        
        for (int i=0; i < employeeNames.length;i++)
        
        {
        
			System.out.println("Employee Name: " +  employeeNames[i] + ", Employee ID: " + employeeIds[i] );
        	
        }
        
   }

}


