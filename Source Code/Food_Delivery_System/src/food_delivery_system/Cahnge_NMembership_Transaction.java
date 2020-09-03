package food_delivery_system;

import static food_delivery_system.Database.GlobalInstance.db;

public class Cahnge_NMembership_Transaction extends Change_CMembership_Transaction {

    public Cahnge_NMembership_Transaction(int customer_id) {
        super(customer_id);
    }

    @Override
    protected Membership get_Membership() {
        
        return new No_Membership();
        
    }

    @Override
    protected void record_Membership(Customer_Account ca) {
        
        Membership mb = ca.getMb();
        
        if(mb instanceof Golden_Membership) {
            Golden_Membership gm = (Golden_Membership) mb;
            db.remove_Membership(gm.getMember_id());
            System.out.println("\n--->>> Your golden membership has been removed");
        }
    }
    
}
