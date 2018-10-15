public class Variable {
	public String instance = "instance var";
	public static String variable = "static var";
	public static String CONST = "static cons";
	public static void main(String[] args) {
		String local = "part var";
		System.out.println(local);
		
		Global global = new Global();
		System.out.println(global.instance);
		System.out.println(variable);
		System.out.println(Global.variable);
	}
}

class Global {
	 public String instance = "global instance var";
	 public static String variable = "global static var";
	 Global() {
	 	System.out.println(instance);
		System.out.println(variable);
	 }
	 public void instance() {
	 	System.out.println(instance);
		System.out.println(Variable.CONST);
	 }
}
