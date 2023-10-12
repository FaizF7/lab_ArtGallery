import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {

       Artist artist;
    Artwork artwork;

    @BeforeEach
    public void setUp(){
        artist = new Artist("Tom");
        artwork = new Artwork("Tom's Masterpiece", 5000, artist);
    }

    @Test
    public void canGetTitle(){
        assertThat(artwork.getTitle()).isEqualTo("Tom's Masterpiece");
    }

    @Test
    public void canSetTitle(){
        artwork.setTitle("Faiz's Masterpiece");
        assertThat(artwork.getTitle()).isEqualTo("Faiz's Masterpiece");
    }

    @Test
    public void canGetArtist(){
        assertThat(artwork.getArtist()).isEqualTo(artist);
    }

    @Test
    public void canSetArtist(){
        Artist artistTwo = new Artist("Faiz");
        artwork.setArtist(artistTwo);
        assertThat(artwork.getArtist()).isEqualTo(artistTwo);
    }

    @Test
    public void canGetPrice(){
        assertThat(artwork.getPrice()).isEqualTo(5000);
    }

    @Test
    public void canSetPrice(){
        artwork.setPrice(10000);
        assertThat(artwork.getPrice()).isEqualTo(10000);
    }



}
