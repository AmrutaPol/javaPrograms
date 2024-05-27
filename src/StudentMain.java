
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Student stu=new Student();
		//Approach - using reference variable
		/*stu.sid=102;
		stu.name="Ira";
		stu.grade='O';
		
		stu.show();*/
		
		//Approach 2- using method
		//stu.setData(101, "Manu", 'O');
		//stu.show();
		
		
		//Approach 3--> Constructors
		Student stu=new Student(101,"Bob",'A');
		stu.show();
		

	}

}
