package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    Date date = new Date("1/1/1999");
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    Dog dog = new Dog("Doggy",date,777);
    // TODO - Create tests for `speak`

    @Test
    public void dogSpeakTest() {
        Dog dog = new Dog("Doggy",date,777);
        String actual = dog.speak();
        String expected = "bark!";
        Assert.assertEquals(expected,actual);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`

    @Test
    public void dogSetBirthdayDateTest() {
        Dog dog = new Dog("Doggy",date,777);
        dog.setBirthDate(new Date("1/1/1999"));
        dog.getBirthDate();
        Date expected = date;
        Assert.assertEquals(expected,dog.getBirthDate());
    }

    // TODO - Create tests for `void eat(Food food)`

    @Test
    public void dogEatTest() {
        Dog dog = new Dog("Doggy",date,777);
        Food food = new Food();
        dog.eat(food);
        Integer expected = 1;
        Integer actual = dog.getNumberOfMealsEaten();
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Integer getId()`


    @Test
    public void dogGetIdTest() {
        Dog dog = new Dog("Doggy",date,777);
        Integer expected = 777;
        Integer actual = dog.getId();
        Assert.assertEquals(expected,actual);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`

    @Test
    public void dogInstanceAnimalTest() {
        Dog dog = new Dog("Doggy",date,777);
        Assert.assertEquals(dog instanceof Animal, true);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void dogInstanceMammalTest() {
        Dog dog = new Dog("Doggy",date,777);
        Assert.assertEquals(dog instanceof Mammal, true);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
