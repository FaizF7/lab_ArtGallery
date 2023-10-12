public class Artwork {
    private String title;
    private Artist artist; // object referenced in other class
    private double price;

    public Artwork(String title, double price, Artist givenArtist){
        this.title = title;
        this.price = price;
        this.artist = givenArtist;

    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtist() {
        return this.artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
