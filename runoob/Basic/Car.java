class Vehicle {}

//public class InstanceCounter {
/* BASIC
	private static int numInstance = 0;
	protected static int getCount() {
		return numInstance;
	}
	
	private static void addInstance() {
		numInstance++;
	}

	InstanceCounter() {
		InstanceCounter.addInstance();
	}

	public static void main(String[] arguments) {
		System.out.println("Starting with " +
		InstanceCounter.getCount() + " instances");
		for (int i = 0; i < 500; ++i) {
			new InstanceCounter();
		}
		System.out.println("Created " +
		InstanceCounter.getCount() + " instances");
	}
*/

/* FINAL
	final int value = 10;
	public static final int BOXWIDTH = 6;
	static final String TITLE = "Manager";

	public void changeValue() {
		//有final关键字的变量无法被改变
		value = 12;
	}
	//用final修饰方法能被子类继承，但不能被子类修改
	public final void changeName(){
		//方法体
	}
*/
//}

// instance运算符用来检测是否是一个对象
public class Car extends Vehicle {
	public static void main(String[] args){
/* INSTANCE1
		Vehicle a = new InstanceCounter();
		boolean result = a instanceof InstanceCounter;
		System.out.println(result);
*/
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Car();
		Car c1 = new Car();
		//Car c2 = new Vehicle();

		boolean result1 = c1 instanceof Vehicle;
		boolean result2 = c1 instanceof Car;
		boolean result3 = v1 instanceof Vehicle;
		boolean result4 = v1 instanceof Car;
		boolean result5 = v2 instanceof Vehicle;
		boolean result6 = v2 instanceof Car;

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
	}
}
