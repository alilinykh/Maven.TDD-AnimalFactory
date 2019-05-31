package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`

    @Test
    public void addCatTest() {
        CatHouse c = new CatHouse();
        Cat cat = new Cat("catty",new Date("1/1/1999"),777);
        c.add(cat);
        Cat actual = c.getCatById(777);
        Assert.assertEquals(cat, actual);
    }

    // TODO - Create tests for `void remove(Integer id)`

    @Test
    public void catRemoveByIdTest() {
        //CatHouse catHouse  = new CatHouse();
        Cat cat = new Cat("catty",new Date("1/1/1999"),777);
        Integer removeCatId = cat.getId();
        CatHouse.add(cat);
        CatHouse.remove(removeCatId);

        Integer expected = CatHouse.getNumberOfCats();
        Integer actual = 0;
        Assert.assertEquals(expected,actual);
    }

    // TODO - Create tests for `void remove(Cat cat)`

    @Test
    public void catRemoveByCatTest() {
        Cat cat = new Cat("catty",new Date("1/1/1999"),777);
        CatHouse.add(cat);
        CatHouse.remove(cat);

        Integer expected = CatHouse.getNumberOfCats();
        Integer actual = 0;
        Assert.assertEquals(expected,actual);
    }

    // TODO - Create tests for `Cat getCatById(Integer id)`

    @Test
    public void catGetCatIdTest() {
        Cat cat = new Cat("catty",new Date("1/1/1999"),777);
        CatHouse.add(cat);
        int expected = CatHouse.getCatById(777).getId();
        int actual = 777;
        Assert.assertEquals(expected,actual);

    }

    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void catGetNumCatsTest() {
        Cat cat = new Cat("catty",new Date("1/1/1999"),777);
        CatHouse.add(cat);
        int expected = CatHouse.getNumberOfCats();
        int actual = 1;
        Assert.assertEquals(expected,actual);


    }
}
