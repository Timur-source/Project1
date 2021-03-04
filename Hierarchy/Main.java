package ru.tpu.Hierarchy;

public class Main {
    public static void main(String[] args) {
        Dishes plate = new Plate("Dishes", "Ceramic", "Red", -1, "Deep");
        Dishes pans = new Pans("Pans", "Metallic", "Gray", 5.6, -7);
        plate.Description();
        pans.Description();

    }
}