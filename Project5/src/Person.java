
public class Person {
	int age;
	public Person(int age) {
		this.age=age;
	}
 public void Person1() {
		if (13 >= age && age <= 19)
		{
			System.out.println("teen");
			}
		else if(age<13) {
			System.out.println("kid");
		}
		else {
			System.out.println("adult");
		}
	}
public static void main(String[] args) {
	Person P=new Person(20);
	P.Person1();

	}

}
