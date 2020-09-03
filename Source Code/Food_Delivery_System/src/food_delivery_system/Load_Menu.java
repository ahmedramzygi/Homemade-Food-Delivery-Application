package food_delivery_system;

import static food_delivery_system.Database.GlobalInstance.db;
import java.util.ArrayList;

public class Load_Menu {
    
    
    Dish d1 = new Dish("Hashem", "nasrcity", "rice", 50);
    Dish d2 = new Dish("Hashem", "nasrcity", "chicken", 60);
    Dish d3 = new Dish("Hashem", "nasrcity", "meatballs", 65);
    Dish d4 = new Dish("Fangary", "nasrcity", "pasta", 45);
    Dish d5 = new Dish("Fangary", "nasrcity", "spagetti", 40);
    Dish d6 = new Dish("Fangary", "nasrcity", "meatballs", 55);
    Dish d7 = new Dish("Fangary", "nasrcity", "chicken", 75);
    Dish d8 = new Dish("Fangary", "nasrcity", "turki", 90);
    
    Dish d9 = new Dish("Ramzy", "korba", "soup", 20);
    Dish d10 = new Dish("Ramzy", "korba", "burger", 75);
    Dish d11 = new Dish("Ramzy", "korba", "pizza", 80);
    Dish d12 = new Dish("Ramzy", "korba", "vegeterianmeal", 85);
    Dish d13 = new Dish("Ramzy", "korba", "springrolls", 40);
    
    Dish d14 = new Dish("Moaaz", "october", "kabab", 150);
    Dish d15 = new Dish("Moaaz", "october", "kofta", 120);
    Dish d16 = new Dish("Moaaz", "october", "chickenpane", 55);
    Dish d17 = new Dish("Moaaz", "october", "mashroomsoup", 30);
    Dish d18 = new Dish("Moaaz", "october", "frenchfries", 15);
    
    
    public void load_dishes() {
        db.add_dish(d1);
        db.add_dish(d2);
        db.add_dish(d3);
        db.add_dish(d4);
        db.add_dish(d5);
        db.add_dish(d6);
        db.add_dish(d7);
        db.add_dish(d8);
        db.add_dish(d9);
        db.add_dish(d10);
        db.add_dish(d11);
        db.add_dish(d12);
        db.add_dish(d13);
        db.add_dish(d14);
        db.add_dish(d15);
        db.add_dish(d16);
        db.add_dish(d17);
        db.add_dish(d18);
    }
    
}    
