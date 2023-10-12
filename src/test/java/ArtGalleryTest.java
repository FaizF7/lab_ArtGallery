import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtGalleryTest {

    Artist artist;
    Artwork artwork;
    Artwork artworkTwo;
    Artwork artworkThree;
    Artwork artworkFour;

    ArtGallery artGallery;

    @BeforeEach
    public void setUp(){

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
        assertThat(artGallery.getName()).isEqualTo("Works of Art");
    }

    @Test
    public void canSetName(){
        artGallery.setName("Artistic Symphony");
        assertThat(artGallery.getName()).isEqualTo("Artistic Symphony");
    }

    @Test
    public void canGetTill(){
        assertThat(artGallery.getTill()).isEqualTo(0);
    }

    @Test
    public void canSetTill(){
        artGallery.setTill(50);
        assertThat(artGallery.getTill()).isEqualTo(50);
    }

   @Test
   public void canGetStock(){
       ArrayList<Artwork> expected = new ArrayList<>();
       expected.add(artwork);
       expected.add(artworkTwo);
       expected.add(artworkThree);
       expected.add(artworkFour);

       assertThat(artGallery.getStock()).isEqualTo(expected);
   }

    @Test
    public void canSetStock(){
        ArrayList<Artwork> expected = new ArrayList<>();
        expected.add(artwork);
        expected.add(artworkTwo);
        expected.add(artworkThree);
        expected.add(artworkFour);

        artGallery.setStock(expected);

        assertThat(artGallery.getStock()).isEqualTo(expected);
    }





}
