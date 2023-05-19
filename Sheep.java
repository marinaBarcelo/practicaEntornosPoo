/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alumnado
 */
public class Sheep extends Animal{
    private String color;
    private static int counter;
    public Sheep(double weight,  String color) {
        super(weight, "Sheeps");
        this.color = color;
        counter++;
    }
    
    public  void canEat(Animal victim){
  
            System.out.println(this+" CAN'T EAT "+  victim);

    };
    
     public boolean isDangerOfExtiction(){
      return counter<3;
    }
     
   public void print(){
        String isInDanger = "";
       if(isDangerOfExtiction()){
         isInDanger =  IN_DANGER_TEXT;
       }
       System.out.println("I am a "+getSpecies()+" and my skin is "+color+". "+isInDanger);
       
   }
    
}
