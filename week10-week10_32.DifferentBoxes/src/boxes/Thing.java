package boxes;

import java.util.ArrayList;
import java.util.List;

public class Thing {

    private String name;
    private int weight;
    

    public Thing(String name, int weight) throws IllegalArgumentException {

        this.name = name;
        
        if(weight < 0){
            throw new IllegalArgumentException("Weight must be positive");
        }
        this.weight = weight;
        
    }

    public Thing(String name) {
        this(name, 0);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Thing other = (Thing) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    
   

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (this.name != null ? this.name.hashCode() : 0);
        return hash;
    }

}
