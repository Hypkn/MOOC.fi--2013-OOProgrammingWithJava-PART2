
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dev
 */
public class VehicleRegister {

    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = new HashMap<RegistrationPlate, String>();
    }

    public boolean add(RegistrationPlate plate, String owner) {
        if (this.owners.get(plate) == null) {
            owners.put(plate, owner);
            return true;

        }
        return false;

    }

    public String get(RegistrationPlate plate) {
        if (this.owners.get(plate) == null) {
            return null;

        }
        return this.owners.get(plate);
    }

    public boolean delete(RegistrationPlate plate) {
        if (this.owners.get(plate) == null) {
            return false;
        } else {
            this.owners.remove(plate);
            return true;
        }
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate rp : owners.keySet()) {
            System.out.println(rp);
        }
    }


    
    
    
    public void printOwners() {
        ArrayList<String> newOwners = new ArrayList<String>();

        for (String owner : owners.values()) {
            if (!newOwners.contains(owner)) {
                newOwners.add(owner);
            }

        }

        for (String owner : newOwners) {

            System.out.println(owner);

        }

    }
}