package cscie55.hw3.zoo.animals;

import cscie55.zoo.animals.Cheetah;
import cscie55.zoo.animals.Giraffe;
import cscie55.zoo.animals.Goat;
import cscie55.zoo.animals.Monkey;
import cscie55.zoo.animals.Tiger;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/******************************
 *
 * class: AnimalTest
 * name: Brendan Murphy
 * CSCIE-55 HW 3
 * date: 10/11/2018
 ******************************/

public class AnimalTest {

	@Test
	public void tigerTests() {
        Tiger tiger = new Tiger("Tony", 34, "yellow and black");
		assertEquals("roar", tiger.speak());
		assertEquals("weeeeee!", tiger.play());
		assertEquals("Yum I love frosted flakes", tiger.eat());
		assertEquals("SHHHHhhhhh", tiger.sleep());
	}

	@Test
	public void monkeyTests() {
		Monkey monkey = new Monkey("George", 1 , "brown");
		assertEquals("squeak", monkey.speak());
		assertEquals("yayyyyyy!", monkey.play());
		assertEquals("Yum I love banana", monkey.eat());
		assertEquals("I am outtta here", monkey.run());
	}

	@Test
	public void cheetahTests() {
		Cheetah cheetah = new Cheetah("Brendan", 5, "Spotted");
		assertEquals("roarrr", cheetah.speak());
		assertEquals("yayyy", cheetah.play());
		assertEquals("Yum I love fish", cheetah.eat());
		assertEquals("Everybody jump!", cheetah.jump());
	}

	@Test
	public void giraffeTests() {
		Giraffe giraffe = new Giraffe("Allen", 10, "Golden");
		assertEquals("hello", giraffe.speak());
		assertEquals("party!", giraffe.play());
		assertEquals("Yum I love branches", giraffe.eat());
		assertEquals("quiet I am sleeping", giraffe.sleep());
	}

	@Test
	public void goatTests() {
		Goat goat = new Goat("Henry", 50, "white");
		assertEquals("bahhh", goat.speak());
		assertEquals("bahhh!!!", goat.play());
		assertEquals("Yum I love pizza", goat.eat());
		assertEquals("catch me if you can!", goat.run());
	}


}
