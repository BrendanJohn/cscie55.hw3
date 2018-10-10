package cscie55.zoo.animals;

import cscie55.zoo.iface.Sleepable;

import java.util.ArrayList;
import java.util.List;

/******************************
 *
 * class: Tiger
 * name: Brendan Murphy
 * CSCIE-55 HW 3
 * date: 10/11/2018
 ******************************/
public class Tiger extends Animal implements Sleepable {

	@Override
	public String sleep(){
		return ("SHHHHhhhhh");
	}

	//3 fields specifying characteristics including favoriteFoods
	private String name;
	private String color;
	private List<String> favoriteFoods = new ArrayList<String>();

	//public, no-argument constructor for each class that allows instances of each class to be created.
	public Tiger(String name, Integer age, String color){
		super(name, age, color);
		this.favoriteFoods.add("bacon");
		this.favoriteFoods.add("frosted flakes");
	}

	public String eat() {
		return ("Yum I love "+ this.favoriteFoods.get(1));
	}

	public String speak() {
		return ("roar");
	}

	public String play() {
		return ("weeeeee!");
	}

}
