package cscie55.zoo.animals;

import java.util.ArrayList;
import java.util.List;

/******************************
 *
 * class: Cheetah
 * name: Brendan Murphy
 * CSCIE-55 HW 3
 * date: 10/11/2018
 ******************************/

public class Cheetah extends Animal{

	private List<String> favoriteFoods = new ArrayList<String>();

	//public, no-argument constructor for each class that allows instances of each class to be created.
	public Cheetah(String name, Integer age, String color){
        super(name, age, color);
		this.favoriteFoods.add("meat");
		this.favoriteFoods.add("fish");
	}

	public String eat() {
		return ("Yum I love "+ this.favoriteFoods.get(1));
	}

	public String speak() {
		return ("roarrr");
	}

	public String play() {
		return ("yayyy");
	}

}
