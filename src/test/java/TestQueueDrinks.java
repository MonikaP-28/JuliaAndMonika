package at.campus02.bsd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestQueueDrinks {

    private QueueDrinks queueDrinks;
    private Liquid liquid;
    private SimpleDrink simpleDrink;

    /**
     * Creates setup, which is used for the tests
     * test-data
     */
    @BeforeEach
    public void setup() {
        queueDrinks = new QueueDrinks(5);
        liquid = new Liquid("Water", 1.0, 0);
        simpleDrink = new SimpleDrink("Water", liquid);
    }

    /**
     * Add simpleDrinks to the queue and a sixth time
     * --> false because maxsize == 5
     */
    @Test
    void offerTest() {
        Assertions.assertEquals(true, queueDrinks.offer(simpleDrink));
        Assertions.assertEquals(true, queueDrinks.offer(simpleDrink));
        Assertions.assertEquals(true, queueDrinks.offer(simpleDrink));
        Assertions.assertEquals(true, queueDrinks.offer(simpleDrink));
        Assertions.assertEquals(true, queueDrinks.offer(simpleDrink));
        Assertions.assertEquals(false, queueDrinks.offer(simpleDrink));
    }

    /**
     * Add a drink to the queue
     */
    @Test
    void pollTest(){
        queueDrinks.offer(simpleDrink);
        assertEquals(simpleDrink, queueDrinks.poll());
    }

    /**
     * Add a drink to the queue and returns first element
     */
    @Test
    void peekTest(){
        queueDrinks.offer(simpleDrink);
        assertEquals(simpleDrink, queueDrinks.peek());
    }

    /**
     * removes a drink from the queue
     */
    @Test
    void removeTest(){
        queueDrinks.offer(simpleDrink);
        assertEquals(simpleDrink, queueDrinks.remove());
    }

    /**
     * Tests if the exception will be thrown
     *@throws throws NoSuchElementException if element doesn't exist
     */
    @Test
    void elementTest(){
        Assertions.assertThrows(NoSuchElementException.class, () -> {queueDrinks.element();});
    }

}


