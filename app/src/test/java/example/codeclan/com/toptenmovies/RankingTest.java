package example.codeclan.com.toptenmovies;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;


/**
 * Created by user on 17/04/2017.
 */

public class RankingTest {

    Ranking ranking;

    @Test
    public void testTitlesInArrayIsEmpty(){
        assertEquals(0, ranking.titlesInArray());
    }
}
