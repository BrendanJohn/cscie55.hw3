package cscie55.zoo.animals;

import cscie55.zoo.iface.Runnable;

import java.util.ArrayList;
import java.util.List;

/******************************
 *
 * class: Monkey
 * name: Brendan Murphy
 * CSCIE-55 HW 3
 * date: 10/11/2018
 ******************************/
public class Monkey extends Animal implements Runnable {

	@Override
	public String run(){
		return ("I am outtta here");
	}
	private List<String> favoriteFoods = new ArrayList<String>();

	//public, no-argument constructor for each class that allows instances of each class to be created.
	public Monkey(String name, Integer age, String color){
		super(name, age, color);
		this.favoriteFoods.add("banana");
		this.favoriteFoods.add("banana");
	}

	public String eat() {
		return ("Yum I love "+ this.favoriteFoods.get(1));
	}

	public String speak() {
		return ("squeak");
	}

	public String play() {
		return ("yayyyyyy!");
	}

}