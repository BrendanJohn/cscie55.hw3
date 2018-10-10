package cscie55.zoo.animals;

import cscie55.zoo.iface.Flyable;

import java.util.ArrayList;
import java.util.List;

/******************************
 *
 * class: Goat
 * name: Brendan Murphy
 * CSCIE-55 HW 3
 * date: 10/11/2018
 ******************************/
public class Goat extends Animal implements Flyable {

	@Override
	public String fly(){
		return ("catch me if you can!");
	}

	private List<String> favoriteFoods = new ArrayList<String>();

	//public, no-argument constructor for each class that allows instances of each class to be created.
	public Goat(String name, Integer age, String color){
		super(name, age, color);
		this.favoriteFoods.add("spaghetti");
		this.favoriteFoods.add("pizza");
	}

	public String eat() {
		return ("Yum I love "+ this.favoriteFoods.get(1));
	}

	public String speak() {
		return ("bahhh");
	}

	public String play() {
		return ("bahhh!!!");
	}

}