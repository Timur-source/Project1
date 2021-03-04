package ru.tpu.Hierarchy;

public class Plate extends Dishes{
    private  String species;

   Plate (String type, String material, String color, double size, String species) {
       super.Dishes(type, material, color, size);
       this.species = species;
   }
    @Override
     public void Description() {
         System.out.println(toString() + ". Разновидность тарелки - " + species);
    }


}
