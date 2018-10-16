package cscie55.zoo.animals;

/******************************
 *
 * class: Animal
 * name: Brendan Murphy
 * CSCIE-55 HW 3
 * date: 10/11/2018
 ******************************/
public abstract class Animal {
    private String name;
    private int age;
    private String color;

    //default constructor
    public Animal () {
        this.name = "Joey";
        this.age = 22;
        this.color = "red";
    }

    public Animal (String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

}
