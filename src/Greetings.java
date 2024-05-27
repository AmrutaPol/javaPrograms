
public class Greetings {

	//1 no param no return value
	void greeting1()
	{
		System.out.println("Hello....");
	}
	
	//2 no param return value
	String greeting2()
	{
		return "How are you??";
	}
	
	//3.take param no return valu
	
	void greeting3(String name)
	{
		System.out.println("Hello.."+name);
	}
	
	//4.take parameter return a valu
	String greeting4(String name)
	{
		return"Hello..."+ ""+name;
	}
}
