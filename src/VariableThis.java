
public class VariableThis {
	
	int x,y;//local variables
	
	void setData(int x,int y)//local variables//method variables
	{
		this.x=x;
		this.y=y;
		
	}
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VariableThis vt=new VariableThis();
		vt.setData(100,200);
		vt.display();
				

	}

}
