import java.util.ArrayList;

public class Customer {
    private String name;
    private double wallet;
    private ArrayList<Artwork> customerCollection;

    public Customer(String name, double wallet){
        this.name = name;
        this.wallet = wallet;
        this.customerCollection = new ArrayList<>();
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

    public ArrayList<Artwork> getCollection(){
        return this.customerCollection;
    }

    public void setCollection(ArrayList<Artwork> collection) {
        this.customerCollection = collection;
    }


    public void buyArt(ArtGallery artGallery, Artwork artworkToBuy){
        this.wallet -= artworkToBuy.getPrice();

        artGallery.addToTill(artworkToBuy.getPrice());

        artGallery.removeArt(artworkToBuy);
        customerCollection.add(artworkToBuy);
    }
}
