package food_delivery_system;

public class Dish {
    
    private String chef_name;
    private String location;
    private String dish_name;
    private double dish_price;

    public Dish(String chef_name, String location, String dish_name, double dish_price) {
        this.chef_name = chef_name;
        this.location = location;
        this.dish_name = dish_name;
        this.dish_price = dish_price;
    }

    public String getLocation() {
        return location;
    }

    public String getChef_name() {
        return chef_name;
    }

    public String getDish_name() {
        return dish_name;
    }

    public double getDish_price() {
        return dish_price;
    }
    
    
    
    
    
}
