package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testRestaurants () {
        Restaurant restaurant = new Restaurant("Lennys", 4);

        assertEquals(
                "Works as expected",
                "Lennys is a 5.0 star restaurant with a price category of 4",
                restaurant.toString());
    }

    @Test
    public void testAddReview () {
        Restaurant restaurant = new Restaurant("Lennys", 4);
        assertEquals("no reviews exist until a review is added", 0, restaurant.reviews.size());

        Review testReviewOne = new Review("this place is good", "Ryan G.", 5);
        Review testReviewTwo = new Review("this place is ok", "Joe", 4);
        Review testReviewThree = new Review("this place sucks", "Stinker", 1);

        restaurant.addReview(testReviewOne);
        assertEquals("can add one review", 1, restaurant.reviews.size());

        restaurant.addReview(testReviewTwo);
        restaurant.addReview(testReviewThree);
        assertEquals("can add multiple reviews", 3, restaurant.reviews.size());
    }

    @Test
    public void testCalcStarRating () {
        Restaurant restaurant = new Restaurant("Lennys", 4);
        Review testReviewOne = new Review("this place is good", "Ryan G.", 5);
        Review testReviewTwo = new Review("this place is ok", "Joe", 4);
        Review testReviewThree = new Review("this place sucks", "Stinker", 3);

        restaurant.addReview(testReviewOne);
        restaurant.addReview(testReviewTwo);
        restaurant.addReview(testReviewThree);

        final double DELTA;
        DELTA = 1e-15;
        assertEquals("works as expected", 4, restaurant.calcStarRating(), DELTA);
    }
}