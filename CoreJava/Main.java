class A { 
	A(int x) {
		System.out.println("A1");
	}
}
class B extends A { 
	B(int y) {
		super(y);
		System.out.println("B1");
	}
}
class Main { 
	public static void main(String[] args) {
		B b = new B(20);
	}
}
