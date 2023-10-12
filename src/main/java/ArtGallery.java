import java.util.ArrayList;

public class ArtGallery {
    private String name;
    private double till;
    private ArrayList<Artwork> stock; // stock

    public ArtGallery(String name){
        this.name = name;
        this.till = 0;
        this.stock = new ArrayList<>(); // empty arraylist
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTill() {
        return this.till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public ArrayList<Artwork> getStock() {
        return this.stock;
    }

    public void setStock(ArrayList<Artwork> stock){
        this.stock = stock;
    }

    public void addArt(Artwork newArt){
        this.stock.add(newArt);
    }
    public void removeArt(Artwork removeArt){
        this.stock.remove(removeArt);
    }
}
