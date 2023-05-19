/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alumnado
 */
public abstract class Animal {
    private double weight;
    private String species;


   public static final String IN_DANGER_TEXT =  "WARNNING!! THIS ANIMAL IS IN DANGER";
    
    public Animal(double weight, String species){
        this.weight = weight;
        this.species = species;
        
    }
    
    

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * @return the species
     */
    public String getSpecies() {
        return species;
    }

    /**
     * @param species the species to set
     */
    public void setSpecies(String species) {
        this.species = species;
    }
    
    //print 
    public abstract void  print();
    /**
     * @return the dangerOfExtiction
     */
    public abstract boolean isDangerOfExtiction();

    public abstract void canEat(Animal victim);

   public String toString() {
       return species + " of " + weight;
   }
   
    
}
