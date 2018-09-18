package cscie55.hw2.zoo.animals;

import java.util.ArrayList;
import java.util.List;

/******************************
* 
* class: Tiger
* name: Brendan Murphy
* CSCIE-55 HW 2
* date: 9/29/2018
******************************/
public class Tiger {

    //3 fields specifying characteristics including favoriteFoods
    private String name;
    private String color;
    private List<String> favoriteFoods = new ArrayList<String>();
    
    //public, no-argument constructor for each class that allows instances of each class to be created.
    public Tiger(){
        this.name = "Sparky";
        this.color = "brown";
        this.favoriteFoods.add("bacon");
        this.favoriteFoods.add("toast");
        eat(this.favoriteFoods.get(1));
    }    
    
    public String eat(String favoriteFood) {
        return ("Yum I love "+ favoriteFood);
    }
    
    public String speak() {
        return ("roar");
    }
    
    public String play() {
        return ("weeeeee!");
    }

}
