/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import reference.domain.Film;
import reference.domain.Rating;

/**
 *
 * @author Dev
 */
public class RatingRegister {

    private HashMap<Film, List<Rating>> filmRatings = new HashMap<Film, List<Rating>>();
    
    public RatingRegister() {

    }

    public void addRating(Film film, Rating rating) { //adds a new rating to the parameter film. The same film can have various same ratings.
       if(!filmRatings.containsKey(film)){
           filmRatings.put(film, new ArrayList <Rating>());
       }
       filmRatings.get(film).add(rating);
    }

    public List<Rating> getRatings(Film film) {    // returns a list of the ratings which were added in connection to a film.
       
        
       
        
        return filmRatings.get(film);
      
    }
    

    public Map<Film, List<Rating>> filmRatings() { //returns a map whose keys are the evaluated films. Each film is associated to a list containing the ratings for that film.
        return null;
    }

}

/**
 * Film theBridgesOfMadisonCounty = new Film("The Bridges of Madison County");
 * Film eraserhead = new Film("Eraserhead");
 *
 * RatingRegister reg = new RatingRegister(); reg.addRating(eraserhead,
 * Rating.BAD); reg.addRating(eraserhead, Rating.BAD); reg.addRating(eraserhead,
 * Rating.GOOD);
 *
 * reg.addRating(theBridgesOfMadisonCounty, Rating.GOOD);
 * reg.addRating(theBridgesOfMadisonCounty, Rating.FINE);
 *
 * System.out.println("All ratings: " + reg.filmRatings());
 * System.out.println("Ratings for Eraserhead: " + reg.getRatings(eraserhead));
 * All ratings: {The Bridges of Madison County=[GOOD, FINE], Eraserhead=[BAD,
 * BAD, GOOD]} Ratings for Eraserhead: [BAD, BAD, GOOD]
 */
