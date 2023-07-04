package innerclass;

class A {
	int i = 10;
}

class B {
	void method() {
		A a = new A();
		System.out.println(a.i);
	}
}
// B 클래스는 A 클래스의 외부 클래스라서 A 클래스의 멤버를 사용하려면 객체를 생성해야 했다. 