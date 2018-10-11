package cscie55.hw3.zoo.animals;

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
	public void createTiger() {
        Tiger tiger = new Tiger();
		assertEquals("roar", tiger.speak());
	}

}
