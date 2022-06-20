package at.campus02.bsd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class TestStringQueue {

    StringQueue squeue = new StringQueue(3);

    @Test
    void offerTest(){
        Boolean result = squeue.offer("IceTea");
        assertEquals(true, result);
    }

    /**
     * add string to queue
     * remove poll
     */
    @Test
    void pollTest(){
        squeue.offer("IceTea");
        String result = squeue.poll();
        assertEquals("IceTea" ,result);
    }

    /**
     * add string to queue
     * remove it with .remove
     */
    @Test
    void removeTest(){
        squeue.offer("IceTea");
        String result = squeue.remove();
        assertEquals("IceTea" ,result);

    }

    /**
     * add string to queue
     * return the first element
     */
    @Test
    void peekTest(){ assertEquals(null, squeue.peek());}

    /**
     * test if exception will be thorwn
     * get element from empty queue
     * @throws throws NoSuchElementException if element doesn't exist
     */
    @Test
    void elementTest(){
        Assertions.assertThrows(NoSuchElementException.class, () -> {squeue.element();});
    }
}
