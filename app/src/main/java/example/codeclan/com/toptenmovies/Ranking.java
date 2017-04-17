package example.codeclan.com.toptenmovies;

/**
 * Created by user on 17/04/2017.
 */

public class Ranking {
    private Movie[] rankings;

    public Ranking(){
        this.rankings = new Movie[10];
    }

    public void addMovie(Movie movie){
        int titlesInArray = titlesInArray();
        this.rankings[titlesInArray] = movie;

    }

    public int titlesInArray(){
        int count = 0;
        for(Movie movie : this.rankings){
            if(movie != null){
                count++;
            }
        }
        return count;
    }


}
