class Person {
	public static void prt(String s) {
		System.out.println(s);
	}

	Person() {
		prt("parent constructor: " + "A person.");
	}

	Person(String name) {
		prt("parent has a param constructor: " + name);
	}
}

public class Chinese extends Person {
	Chinese() {
		super();//调用父类的构造方法
		prt("child use parent constructor: " +"A chinese coder");
	}
	Chinese(String name) {
		super(name);
		prt("child use parent constructor has param: his name is " + name);
	}

	Chinese(String name, int age) {
		this(name);
		prt("child: use self constructor: his age is " + age);
	}

	public static void main(String[] args) {
		Chinese cn = new Chinese();
		cn = new Chinese("wenliang");
		cn = new Chinese("wenliang", 29);
	}
}
