package inheritance;

import java.util.LinkedList;

public class Restaurant {

    String name;
    double stars;
    int priceCategory;
    LinkedList reviews;
    double ratingsSum = 0;


    public Restaurant(String name, int priceCategory) {
        this.name = name;
        this.stars = 5.0;
        this.priceCategory = priceCategory;
        this.reviews = new LinkedList();
        this.ratingsSum = 0;
    }

    //@Override flag itself doesn't override, But rather, it's inclusion will break code if it is NOT actually overriding
    @Override
    public String toString () {
        return String.format("%s is a %.1f star restaurant with a price category of %d", this.name, this.stars, this.priceCategory);
    }

    //add review as a node to the reviews LinkedList
    public void addReview (Review review) {
        this.reviews.add(review);
        this.ratingsSum+= review.stars;
    }

    //calculate star rating for a restaurant
    public double calcStarRating () {
        if (this.reviews.size() == 0) {
            return this.stars;
        } else {
        this.stars = this.ratingsSum / this.reviews.size();
        }
        return this.stars;
    }
}
