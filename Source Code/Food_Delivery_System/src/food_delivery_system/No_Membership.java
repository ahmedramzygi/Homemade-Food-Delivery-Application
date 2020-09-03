package food_delivery_system;

public class No_Membership implements Membership {

    @Override
    public double apply_discount(double payment) {
        
        return payment;
        
    }
}
