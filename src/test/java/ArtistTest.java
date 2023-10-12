import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtistTest {

    Artist artist;

    @BeforeEach
    public void setUp(){
        artist = new Artist("Tom");
    }
    
    @Test
    public void canGetName(){
        assertThat(artist.getName()).isEqualTo("Tom");        
    }    
    
    @Test
    public void canSetName(){
        artist.setName("Faiz");
        assertThat(artist.getName()).isEqualTo("Faiz");
    }

}
