/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alumnado
 */
public class Rat extends Animal{
       private boolean rabies;
       private static int counter;
       
    public Rat(double weight, boolean rabies) {
        super(weight, "Rat");
        this.rabies = rabies;
        counter++;
    }
     public boolean isDangerOfExtiction(){
     return counter<3;
   }
     
    public  void canEat(Animal victim){
        
       if(rabies || (!this.getSpecies().equals(victim.getSpecies()) && this.getWeight() > victim.getWeight() )){   
           System.out.println(this+" CAN EAT "+victim);
  
       } else{
            System.out.println(this+" CAN'T EAT "+  victim);
       
       }
    
    };
    
     public void print(){
         String isInDanger = " ";
         if(isDangerOfExtiction()){
             isInDanger =  IN_DANGER_TEXT;
         }
         
         
         if(isRabies()){
            System.out.println("I am a "+getSpecies()+" and I have rabies "+" and the weight is "+getWeight()+" "+isInDanger);
         }else{
            System.out.println("I am a "+getSpecies()+" and I don't have rabies"+" and the weight is "+getWeight()+" "+isInDanger);

         }
         
       
         
     }

    /**
     * @return the rabies
     */
    public boolean isRabies() {
        return rabies;
    }

    /**
     * @param rabies the rabies to set
     */
    public void setRabies(boolean rabies) {
        this.rabies = rabies;
    }
}
