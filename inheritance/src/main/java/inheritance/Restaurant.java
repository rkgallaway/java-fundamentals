package inheritance;

import java.util.LinkedList;

public class Restaurant {

    String name;
    boolean isChain;
    String location;
    double stars;
    int priceCategory;
    LinkedList reviews;
    double ratingsSum = 0;


    public Restaurant(String name, boolean isChain, String location, int priceCategory) {
        this.name = name;
        this.isChain = isChain;
        this.location = location;
        this.stars = 5.0;
        this.priceCategory = priceCategory;
        this.reviews = new LinkedList();
        this.ratingsSum = 0;

        this.calcStarRating();
    }

    //@Override flag itself doesn't override, But rather, it's inclusion will break code if it is NOT actually overriding
    @Override
    public String toString () {
        if ( this.isChain) {
            return String.format("This %s %s location is a %.1f star restaurant with a price category of %d", this.location, this.name, this.stars, this.priceCategory);
        }
        return String.format("%s is a %.1f star restaurant with a price category of %d", this.name, this.stars, this.priceCategory);
    }

    //add review as a node to the reviews LinkedList
    public void addReview (Review review) {
        this.reviews.add(review);
        this.ratingsSum+= review.stars;
        this.calcStarRating();
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
