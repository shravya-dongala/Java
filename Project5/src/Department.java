
abstract class Department {
	abstract void getDepartmentsize(); 
	}
class Sub extends Department{
		void getDepartmentsize() {
			
			int i= 120;
			System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department D=new Sub();
		D.getDepartmentsize();
		

	}

}

