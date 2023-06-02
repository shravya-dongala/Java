
public class Example {
	void Display() {
		System.out.println("ABC");
	}}
class Example1 extends Example{
	void Display() {
		System.out.println("XYZ");
}
	public static void main(String[] args) {
Example E= new Example1();
E.Display();
	}
}
