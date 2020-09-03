package food_delivery_system;

import static food_delivery_system.Database.GlobalInstance.db;

public class Change_GMembership_Transaction extends Change_CMembership_Transaction {
    
    private final int member_id;

    public Change_GMembership_Transaction(int member_id, int customer_id) {
        super(customer_id);
        this.member_id = member_id;
    }

    @Override
    protected Membership get_Membership() {
        
        return new Golden_Membership(member_id);
        
    }

    @Override
    protected void record_Membership(Customer_Account ca) {
        db.add_Membership(member_id, ca);
        System.out.println("\n--->>> You are now a gold member");
        System.out.println("--->>> Your unique member id is " + member_id);
        System.out.println("--->>> A discount of 25% will be applied to your payments");
    }
    
}
