package cscie55.zoo.animals;

import java.util.ArrayList;
import java.util.List;

/******************************
 *
 * class: Monkey
 * name: Brendan Murphy
 * CSCIE-55 HW 3
 * date: 10/11/2018
 ******************************/
public class Monkey {

	//3 fields specifying characteristics including favoriteFoods
	private String name;
	private String color;
	private List<String> favoriteFoods = new ArrayList<String>();

	//public, no-argument constructor for each class that allows instances of each class to be created.
	public Monkey(){
		this.name = "Billy";
		this.color = "gray";
		this.favoriteFoods.add("banana");
		this.favoriteFoods.add("banana");
		eat(this.favoriteFoods.get(1));
	}

	public String eat(String favoriteFood) {
		return ("Yum I love "+ favoriteFood);
	}

	public String speak() {
		return ("squeak");
	}

	public String play() {
		return ("yayyyyyy!");
	}

}