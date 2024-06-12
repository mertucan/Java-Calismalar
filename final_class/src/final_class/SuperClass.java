package final_class;

public class SuperClass {
	public /*final*/ void display() {
		System.out.println("Bu bir final metoddur ve override edilemez.");	
	}
}

class SubClass extends SuperClass{
	@Override
	public void display() {
		System.out.println("Deneme");
	}
}
