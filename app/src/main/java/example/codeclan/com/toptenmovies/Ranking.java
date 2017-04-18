package example.codeclan.com.toptenmovies;


import java.util.Arrays;
import java.util.List;
/**
 * Created by user on 17/04/2017.
 */

public class Ranking {
    private Movie[] rankings;

    public Ranking(){
        this.rankings = new Movie[10];
    }

    public void addMovie(Movie movie){
        int index = movie.getRating() - 1;
        this.rankings[index] = movie;
    }

    public Movie getMovieByRank(int rating) {
        return this.rankings[rating - 1];
    }

    public Movie getMovieByTitle(String title) {
        for(Movie x : rankings){
            if(x.getTitle() == title){
                return x;
            }

        }
        return null;
    }

}