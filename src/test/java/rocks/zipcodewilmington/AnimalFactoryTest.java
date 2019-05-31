package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`

    @Test
    public void animalCreateDogTest() {
        Dog dog = AnimalFactory.createDog("doggy", new Date("1/1/1999"));
        String expectedName = dog.getName();
        String actualName = "doggy";
        Date expectedDate = dog.getBirthDate();
        Date actualDate = new Date("1/1/1999");

        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedDate,actualDate);
    }

    
    
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void animalCreateCatTest() {
        Cat cat = AnimalFactory.createCat("catty", new Date("1/1/1999"));
        String expectedName = cat.getName();
        String actualName = "catty";
        Date expectedDate = cat.getBirthDate();
        Date actualDate = new Date("1/1/1999");

        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedDate,actualDate);
    }

}
