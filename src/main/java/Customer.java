public class Customer {
    private String name;
    private double wallet;

    public Customer(String name, double wallet){
        this.name = name;
        this.wallet = wallet;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWallet() {
        return this.wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public void buyArt(ArtGallery artGallery, Artwork artworkToBuy){
        this.wallet -= artworkToBuy.getPrice();

        artGallery.addToTill(artworkToBuy.getPrice());

        artGallery.removeArt(artworkToBuy);

    }
}
