class Out {
	private int age = 12;

	class In {
		//使用内部类的好处是可以访问外部类私有属性
		public void print() {
			System.out.println(age);
		}
	}
}

public class Demo {
	public static void main(String[] args) {
		Out.In in = new Out().new In();
		in.print();
	}
}
