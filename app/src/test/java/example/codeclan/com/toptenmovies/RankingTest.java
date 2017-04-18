package example.codeclan.com.toptenmovies;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;


/**
 * Created by user on 17/04/2017.
 */

public class RankingTest {

    Ranking ranking;
    Movie movie1;
    Movie movie2;
    Movie movie10;

    @Before
    public void before(){
        ranking = new Ranking();
        movie1 = new Movie("The Godfather", "Thriller", 1);
        movie2 = new Movie("Schindler's List ", "Drama", 2);
        movie10 = new Movie("Central Station", "Rom-Com", 10);
    }

    @Test
    public void testAddingMovieCanBeReturnedByRank(){
        ranking.addMovie(movie1);
        ranking.addMovie(movie2);
        Movie mymovie = ranking.getMovieByRank(2);
        assertEquals(2, mymovie.getRating());
    }

    @Test
    public void testMovieInArrayCanReturnTitle(){
        ranking.addMovie(movie1);
        Movie mymovie = ranking.getMovieByRank(1);
        assertEquals("The Godfather", mymovie.getTitle());
    }

    @Test
    public void testCanReplaceMovieInRankTen(){
        Movie newMovie = new Movie("Jaws", "Action", 10);
        ranking.addMovie(newMovie);
        assertEquals("Jaws", newMovie.getTitle());
    }

    @Test
    public void testCanMovieMovieUpandDownByRanking(){
        movie1.setFilmRating(2);
        movie2.setFilmRating(1);
        ranking.addMovie(movie1);
        ranking.addMovie(movie2);
        Movie newMovie = ranking.getMovieByRank(2);
        assertEquals("The Godfather", newMovie.getTitle());
    }

    @Test
    public void testCanFindMovieInListByTitle(){
        Movie searchedByTitle = ranking.getMovieByTitle("The Godfather");
        assertEquals("Thriller", searchedByTitle.getGenre());
    }





}
