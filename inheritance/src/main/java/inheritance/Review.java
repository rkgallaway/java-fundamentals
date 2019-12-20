package inheritance;

public class Review {

    String body;
    String author;
    double stars;

    public Review(String body, String author, double stars) {
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    @Override
    public String toString () {
        return String.format("%s gives a %.1f star review.  Details:  %s", this.author, this.stars, this.body);
    }

    //extend with a user class... this user could then be passed as author, only allowed one entry per restaurant and delete reviews from this user??
}
