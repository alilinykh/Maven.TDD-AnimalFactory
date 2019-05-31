package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`

    @Test
    public void addDogTest() {
        //Dog dog = new Dog("doggo",new Date("1/1/1999"),777);
        Dog dog = new Dog("doggy",new Date("1/1/1999"),777);
        DogHouse.add(dog);
        Integer expected = 1;
        Integer actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected,actual);
    }

    // TODO - Create tests for `void remove(Integer id)`

    @Test
    public void dogRemoveTest() {
        Dog dog = new Dog("doggo",new Date("1/1/1999"),777);
        DogHouse.add(dog);
        DogHouse.remove(777);
        Integer expected = 0;
        Integer actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected,actual);
    }

    // TODO - Create tests for `void remove(Dog dog)`

    @Test
    public void dogRemoveObjectTest() {
        Dog dog = new Dog("doggo",new Date("1/1/1999"),777);
        DogHouse.add(dog);
        DogHouse.remove(dog);
        Integer expected = 0;
        Integer actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected,actual);
    }

    // TODO - Create tests for `Dog getDogById(Integer id)`

    @Test
    public void dogGetDogByIdTest() {
        Dog dog = new Dog("doggo",new Date("1/1/1999"),777);
        DogHouse.add(dog);

        Integer expected = 777;
        Integer actual = DogHouse.getDogById(777).getId();
        Assert.assertEquals(expected,actual);
    }

    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
