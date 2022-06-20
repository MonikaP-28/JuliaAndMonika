package at.campus02.bsd;

import at.campus02.bsd.drinks.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestStringQueue {

    StringQueue squeue = new StringQueue(3);

    @Test
    void offerTest(){
        Boolean result = squeue.offer("IceTea");
        assertEquals(true, result);
    }

    @Test
    void pollTest(){
        squeue.offer("IceTea");
        String result = squeue.poll();
        assertEquals("appleJuice" ,result);
    }
    @Test
    void removeTest(){
        squeue.offer("IceTea");
        String result = squeue.remove();
        assertEquals("IceTea" ,result);

    }
    @Test
    void peekTest(){ assertEquals(null, squeue.peek());}

    @Test
    void elementTest(){
        squeue.offer("IceTea");
        assertEquals("IceTea", squeue.element());
    }
}
