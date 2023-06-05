interface Add{
		abstract void addition();
		interface multiply{
			abstract void mul();
		}
		
public class InterfaceExp implements Add , multiply {
	@Override
	public void mul() {
		System.out.println("Multiply");
		
	}

	@Override
	public void addition() {
		System.out.println("Addition");	
	}
	
public static void main(String[] args) {
		InterfaceExp I = new InterfaceExp();
		I.mul();
		I.addition();

	}


}}