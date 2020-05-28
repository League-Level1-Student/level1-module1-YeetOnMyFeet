package _02_cat;

public class CatRunner {
public static void main(String[] args) {
	
	
	Cat joe = new Cat("joe");
	joe.meow();
	joe.printName();
	for (int i = 0; i < 9; i++) {
		joe.kill();
	}
	Cat john = new Cat("john");
}
}
