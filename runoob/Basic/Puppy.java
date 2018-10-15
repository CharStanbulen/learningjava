public class Puppy {
	/* basic
	public Puppy(String name) {
		System.out.println("The dog's name is: " + name);
	}
	public static void main(String []args) {
		Puppy myPuppy = new Puppy("tommy");
	}
	*/

	int puppyAge;
	public Puppy(String name) {
		System.out.println("The name of dog is: " + name);
	}

	public void setAge(int age) {
		puppyAge = age;
	}

	public int getAge() {
		System.out.println("The dog age is : " + puppyAge);
		return puppyAge;
	}

	public static void main(String []args) {
		Puppy myPuppy = new Puppy("tommy");
		myPuppy.setAge(2);
		myPuppy.getAge();
		System.out.println("variable value is : " + myPuppy.puppyAge);
	}
}
