package nyp_hafta5;

public class A {
	public A() {
		System.out.println("A() içinde.");
	}
	C c = new C();
	
	public class B {
		public B() {
			System.out.println("B() içinde.");
		}
		
	public void f() {
		System.out.println("f() içinde.");
	}
	
	public class C {
		static B b = new B();
		public C() {
			System.out.println("C() içinde.");
		}
	}
}
	}

