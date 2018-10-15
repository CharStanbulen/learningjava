class A {
	static int i;
	void change(int i1) {i = i1;}
}

public class StaticTest {
/* basic
	//对象变量当读到类的代码字节时便能被使用
	private static int staticInt = 2;
	//实例变量必须对象被创建后才能使用
	private int random = 2;

	//类的构造函数
	public StaticTest() {
		staticInt++;
		random++;
		
		System.out.println("staticInt = " + staticInt + " random = " + random);
	}

	public static void main(String[] args) {
		StaticTest test = new StaticTest();
		StaticTest test2 = new StaticTest();
	}
*/

	public static void main(String[] args) {
		A.i = 10;
		A a = new A();
		A b = new A();
		System.out.println(A.i + "," + a.i + "," + b.i);
		a.change(40);
		System.out.println(A.i + "," + a.i + "," + b.i);
		b.i += 10;
		System.out.println(A.i + "," + a.i + "," + b.i);
	}
}

