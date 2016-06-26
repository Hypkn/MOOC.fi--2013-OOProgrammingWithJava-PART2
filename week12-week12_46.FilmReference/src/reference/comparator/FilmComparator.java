/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;

/**
 *
 * @author dev
 */
public class FilmComparator implements Comparator<Film> {
    
    private Map<Film , List<Rating>> ratings;
    
    public FilmComparator(Map<Film, List<Rating>> ratings){
        this.ratings = ratings;
    }

    
    private double getAverage(Film f){
        int ratingcnt = 0;
        double avg = 0;
        for(Rating r: ratings.get(f)){
            avg+= r.getValue();
            ratingcnt++;
        }
    
        return avg /ratingcnt;
}
    
    @Override 
    public int compare(Film f, Film f1){
       double avgf = getAverage(f);
       double avgf1 = getAverage(f1);
       
       if(avgf > avgf1){
        return -1;
    }
       if(avgf < avgf1){
           return 1;
       }
       
     return 0;
}
}
