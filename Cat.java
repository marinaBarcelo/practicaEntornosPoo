/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alumnado
 */
public class Cat extends Animal{
    private static int counter;
    
    public Cat(double weight) {
        super(weight, "Cat");
        counter++;
    }
    
   public boolean isDangerOfExtiction(){
     return counter<3;
   }
   
   public void canEat(Animal victim){

       if(!this.getSpecies().equals(victim.getSpecies()) && this.getWeight() > victim.getWeight() ){   
           System.out.println(this+" CAN EAT "+victim);
  
       }
       else {
            System.out.println(this+" CAN'T EAT "+  victim);
       }
   }
    
    public void print(){
        
        String isInDanger="";
        if(isDangerOfExtiction()){
             isInDanger = IN_DANGER_TEXT;
        }
        
           System.out.println("I am a "+getSpecies()+" and my weight is "+getWeight()+" "+isInDanger);

    }
    
}
