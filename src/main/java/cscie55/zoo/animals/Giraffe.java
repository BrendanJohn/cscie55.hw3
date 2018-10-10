package cscie55.zoo.animals;

import cscie55.zoo.iface.Sleepable;

import java.util.ArrayList;
import java.util.List;

/******************************
 *
 * class: Giraffe
 * name: Brendan Murphy
 * CSCIE-55 HW 3
 * date: 10/11/2018
 ******************************/
public class Giraffe extends Animal implements Sleepable {

	@Override
	public String sleep(){
		return ("quiet I am sleeping");
	}

	private List<String> favoriteFoods = new ArrayList<String>();

	//public, no-argument constructor for each class that allows instances of each class to be created.
	public Giraffe(String name, Integer age, String color){
		super(name, age, color);
		this.favoriteFoods.add("leaves");
		this.favoriteFoods.add("branches");
	}

	public String eat() {
		return ("Yum I love "+ this.favoriteFoods.get(1));
	}

	public String speak() {
		return ("hello");
	}

	public String play() {
		return ("party!");
	}

}