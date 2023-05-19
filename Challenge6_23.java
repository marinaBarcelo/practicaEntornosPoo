
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alumnado
 */
public class Challenge6_23 {
    public static void main(String[] args) {
        
        ArrayList <Animal> animals = new ArrayList();
        //CATS
        Cat cat1 = new Cat(2.22);
         animals.add(cat1);
        Cat cat2 = new Cat(3.5);
         animals.add(cat2);
        Cat cat3 = new Cat(20.5);
         animals.add(cat3);
        Cat cat4 = new Cat(10.5);
         animals.add(cat4);
        Cat cat5 = new Cat(3.5);
         animals.add(cat5);
       
        //SHEEPS
        System.out.println(" ");
        Sheep sheep1 = new Sheep(30.20,  "Brown");
         animals.add(sheep1);
        Sheep sheep2 = new Sheep(25.20,  "White");
         animals.add(sheep2);
        
        //Rat
        System.out.println(" ");
        Rat rat1 = new Rat(8.00, true);
         animals.add(rat1);
        Rat rat2 = new Rat(2.85, false);
         animals.add(rat2);
        Rat rat3 = new Rat(1.00, false);
        animals.add(rat3);
        
        for (Animal animal : animals) {
            animal.print();
           
            
        }
        System.out.println("------------------------------");
        cat4.canEat(cat2);
        cat2.canEat(rat2);
        cat4.canEat(sheep2);
        
        System.out.println("------------------------------");
        sheep2.canEat(rat3);
        sheep2.canEat(cat1);
        
        System.out.println("------------------------------");
        
        rat1.canEat(cat3);
        rat2.canEat(sheep2);
    }
    
}
