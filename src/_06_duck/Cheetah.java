package _06_duck;

public class Cheetah {

	
	int numberOfSiblings;
	String favoritePlace;
	void run() {
		System.out.println("I am running");
	}
	void eat() {
		System.out.println("I am eating");
	}
	Cheetah(int numberOfSiblings, String favoritePlace){
		this.numberOfSiblings = numberOfSiblings;
		this.favoritePlace = favoritePlace;
	}
	
}
