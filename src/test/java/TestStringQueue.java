package at.campus02.bsd;

import at.campus02.bsd.drinks.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;

public class TestStringQueue {

    StringQueue stringQueue = new StringQueue(3);

    @Test
    void offerTest(){
        Boolean result = stringQueue.offer("appleJuice");
        assertEquals(true, result);
    }

    @Test
    void pollTest(){
        stringQueue.offer("appleJuice");
        String result = stringQueue.poll();
        assertEquals("appleJuice" ,result);
    }
    @Test
    void removeTest(){
        stringQueue.offer("appleJuice");
        String result = stringQueue.remove();
        assertEquals("appleJuice" ,result);

    }
    @Test
    void peekTest(){ assertEquals(null, stringQueue.peek());}

    @Test
    void elementTest(){
        stringQueue.offer("appleJuice");
        assertEquals("appleJuice", stringQueue.element());
    }
}
