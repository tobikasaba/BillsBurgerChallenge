import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MealOrderTest {
    Burger cheeseburger = new Burger("Cheeseburger", 20);
    Drink wine = new Drink("Wine", 20);
    Side fries = new Side("Fries", 5);

    @Test
    void burgerType() {
        assertEquals("Cheeseburger", cheeseburger.getType());
    }

    @Test
    void burgerPrice() {
        assertEquals(20, cheeseburger.getPrice());
    }

    @Test
    void doesBurgerPriceBelowOneThrowIllegalArgumentException() {
/*
        IllegalArgumentException priceBelowZero = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            cheeseburger.setPrice(0);
        });
 */
        IllegalArgumentException priceBelowZero = assertThrows(IllegalArgumentException.class, () -> cheeseburger.setPrice(0));
        assertEquals(priceBelowZero.getMessage(), "Price can't be below 1");
    }

    @Test
    void burgerToppings() {
        cheeseburger.setToppings(3);
        assertEquals(3, cheeseburger.getToppings());
    }

    @Test
    void maximumOfThreeToppings() {
        IllegalArgumentException maximumToppings = assertThrows(IllegalArgumentException.class, () -> cheeseburger.setToppings(4));
        assertEquals(maximumToppings.getMessage(), "Maximum of 3 toppings allowed and negative values are invalid");
    }

    @Test
    void drinkType() {
        assertEquals("Wine", wine.getType());
    }

    @Test
    void drinkSize() {
        assertEquals(20, wine.getSize());
    }

    @Test
    void doesDrinkSizeBelowOneHundredThrowIllegalArgumentException() {
        IllegalArgumentException drinkSizeBelowHundred = assertThrows(IllegalArgumentException.class, () -> wine.setSize(99));
        assertEquals(drinkSizeBelowHundred.getMessage(), "Drinks cant be less that 100 ml");
    }

    @Test
    void drinkPrice() {
        assertEquals(30, wine.getPrice());
    }

    @Test
    void sideType() {
        assertEquals("Fries", fries.getType());
    }

    @Test
    void sidePrice() {
        assertEquals(5, fries.getPrice());
    }


    @Test
    void doesSidePriceBelowOneThrowIllegalArgumentException() {
        IllegalArgumentException priceBelowZero = assertThrows(IllegalArgumentException.class,
                () -> fries.setPrice(0));
        assertEquals(priceBelowZero.getMessage(), "Price can't be below 1");
    }
}
