
public class Employee {
	
	
	int eid;
	String name;
	String job;
	int esal;
	
	
	void display()
	{
		System.out.println(eid);
		System.out.println(name);
		System.out.println(job);
		System.out.println(esal);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1=new Employee();
		
		emp1.eid=101;
		emp1.name="John";
		emp1.job="Engineer";
		emp1.esal=50000;
		
		emp1.display();
		
		Employee emp2=new Employee();
		
		emp2.eid=102;
		emp2.name="Janis";
		emp2.job="Architect";
		emp2.esal=54800;
		
		emp2.display();
		
		
	}

}
