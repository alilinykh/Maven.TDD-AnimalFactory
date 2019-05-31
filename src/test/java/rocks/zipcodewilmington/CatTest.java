package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    Date date = new Date("1/1/1999");

    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setNameTest() {
        Cat cat1 = new Cat("catName",new Date(),1);
        String expected = "newCatName";
        cat1.setName(expected);
        Assert.assertEquals(expected, cat1.getName());
    }


    // TODO - Create tests for `speak`

    @Test
    public void catSpeakTest() {
        Cat cat = new Cat("cat",new Date(),666);
        String expected = "meow!";
        Assert.assertEquals(expected,cat.speak());
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`

    @Test
    public void setBirthDateCatTest() {
        Cat cat = new Cat("cat",date,666);
        Date expected = date;
        Assert.assertEquals(expected,date);
    }
    // TODO - Create tests for `void eat(Food food)`

    @Test
    public void eatCatTest() {
        Cat cat = new Cat("cat",date,666);
        Food food = new Food();
        cat.eat(food);
        Integer expected = cat.getNumberOfMealsEaten();
        Integer actual = 1;
        Assert.assertEquals(expected,actual);
    }
    // TODO - Create tests for `Integer getId()`

    @Test
    public void catGetIdTest() {
        Cat cat = new Cat("cat",date,666);
        Integer expected = 666;
        Integer actual = cat.getId();
        Assert.assertEquals(expected,actual);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`

    @Test
    public void animalInheritanceTest() {
        Cat cat = new Cat("cat",date,666);

        Assert.assertEquals(cat instanceof Animal, true);
    }


    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void mammalInheritanceTest() {
            Cat cat = new Cat("cat",date,666);
            Assert.assertEquals(cat instanceof Mammal, true);
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
