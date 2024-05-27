
public class GreetingsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Greetings gr=new Greetings();
		gr.greeting1();  //st method
		
		//String str=gr.greeting2();//2nd method
		//
		//System.out.println(str);

		System.out.println(gr.greeting2());
		
		gr.greeting3("Amruta");
		
		String str=gr.greeting4("Pol");
		System.out.println(str);
	}

}
