package cscie55.zoo.animals;

import java.util.ArrayList;
import java.util.List;

/******************************
 *
 * class: Giraffe
 * name: Brendan Murphy
 * CSCIE-55 HW 3
 * date: 10/11/2018
 ******************************/
public class Giraffe {

	//3 fields specifying characteristics including favoriteFoods
	private String name;
	private String color;
	private List<String> favoriteFoods = new ArrayList<String>();

	//public, no-argument constructor for each class that allows instances of each class to be created.
	public Giraffe(){
		this.name = "Allen";
		this.color = "spotted";
		this.favoriteFoods.add("leaves");
		this.favoriteFoods.add("branches");
		eat(this.favoriteFoods.get(1));
	}

	public String eat(String favoriteFood) {
		return ("Yum I love "+ favoriteFood);
	}

	public String speak() {
		return ("hello");
	}

	public String play() {
		return ("party!");
	}

}