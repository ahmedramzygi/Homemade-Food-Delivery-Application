package food_delivery_system;

public class Golden_Membership implements Membership {
    
    private final int member_id;
    private int discount = 25;

    public Golden_Membership(int member_id) {
        this.member_id = member_id;
    }

    public int getMember_id() {
        return member_id;
    }
    
    @Override
    public double apply_discount(double payment) {
        
        return ( (payment) - ( payment * discount / 100 ) );
        
    }
}
