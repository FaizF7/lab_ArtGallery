import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    Artist artist;
    Artwork artwork;
    Artwork artworkTwo;
    Artwork artworkThree;
    Artwork artworkFour;
    ArtGallery artGallery;

    Customer customer;

   @BeforeEach
   public void setUp(){
       customer = new Customer("Faiz", 10000);
       artist = new Artist("Tom");
       artwork = new Artwork("Tom's Masterpiece", 5000, artist);
       artworkTwo = new Artwork("Tom's Masterpiece 2", 9000, artist);
       artworkThree = new Artwork("Windows XP", 1, artist);
       artworkFour = new Artwork("Tom's Masterpiece", 50, artist);

       artGallery = new ArtGallery("Works of Art");

       artGallery.addArt(artwork);
       artGallery.addArt(artworkTwo);
       artGallery.addArt(artworkThree);
       artGallery.addArt(artworkFour);
   }

   @Test
   public void canGetName(){
       assertThat(customer.getName()).isEqualTo("Faiz");
   }

   @Test
   public void canSetName(){
       customer.setName("Tom");
       assertThat(customer.getName()).isEqualTo("Tom");
   }

   @Test
   public void canGetWallet(){
       assertThat(customer.getWallet()).isEqualTo(10000);
   }

   @Test
   public void canSetWallet(){
       customer.setWallet(10);
       assertThat(customer.getWallet()).isEqualTo(10);
   }

   @Test
   public void canBuyArt(){
       customer.buyArt(artGallery,artwork);

       ArrayList<Artwork> expectedStock = new ArrayList<>();
       expectedStock.add(artworkTwo);
       expectedStock.add(artworkThree);
       expectedStock.add(artworkFour);
       
      ArrayList<Artwork> expectedCollection = new ArrayList<>();
       expectedCollection.add(artwork);

       assertThat(customer.getWallet()).isEqualTo(5000);
       assertThat(artGallery.getTill()).isEqualTo(5000);
       assertThat(artGallery.getStock()).isEqualTo(expectedStock);
       assertThat(customer.getCollection()).isEqualTo(expectedCollection);
       
       

   }

}