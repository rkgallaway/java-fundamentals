package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testReview () {
        Review review = new Review("I like it", "Ryan G.", 5.0);
        assertEquals("works as expected", "Ryan G. gives a 5.0 star review.  Details:  I like it", review.toString());
    }

}