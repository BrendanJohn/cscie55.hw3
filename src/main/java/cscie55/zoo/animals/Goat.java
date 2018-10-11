package cscie55.zoo.animals;

import java.util.ArrayList;
import java.util.List;

/******************************
 *
 * class: Goat
 * name: Brendan Murphy
 * CSCIE-55 HW 3
 * date: 10/11/2018
 ******************************/
public class Goat {

	//3 fields specifying characteristics including favoriteFoods
	private String name;
	private String color;
	private List<String> favoriteFoods = new ArrayList<String>();

	//public, no-argument constructor for each class that allows instances of each class to be created.
	public Goat(){
		this.name = "Henry";
		this.color = "white";
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