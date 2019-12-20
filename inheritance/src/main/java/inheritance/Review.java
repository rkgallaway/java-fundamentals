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
}
