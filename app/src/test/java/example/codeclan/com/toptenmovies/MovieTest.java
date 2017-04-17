package example.codeclan.com.toptenmovies;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 17/04/2017.
 */

public class MovieTest {

    Movie movie1;

    @Before
    public void before(){
        movie1 = new Movie("The Godfather", "Thriller", 1.0);
    }

    @Test
    public void testCanGetTitle(){
        assertEquals("The Godfather", movie1.getTitle());
    }

    @Test
    public void testCanGetGenre(){
        assertEquals("Thriller", movie1.getGenre());
    }

    @Test
    public void testCanGetCurrentRating(){
        assertEquals(1.0, movie1.getRating());
    }

    @Test
    public void testSetFilmTitle(){
        movie1.setTitle("Fight Club");
        assertEquals("Fight Club", movie1.getTitle());
    }

    @Test
    public void testSetFilmGenre(){
        movie1.setGenre("Drama");
        assertEquals("Drama", movie1.getGenre());
    }

    @Test
    public void testSetFilmRating(){
        movie1.setFilmRating(2.0);
        assertEquals(2.0, movie1.getRating());
    }

    @Test
    public void testReturnAllMovieDetails(){
        movie1.setTitle("Logan");
        assertEquals("Title: Logan Genre: Thriller Rating: 1.0", movie1.getAllDetails());
    }

}
