package food_delivery_system;

public abstract class Change_CMembership_Transaction extends Change_Customer_Account_Transaction {

    public Change_CMembership_Transaction(int customer_id) {
        super(customer_id);
    }

    @Override
    protected void change(Customer_Account ca) {
        
        record_Membership(ca);
        ca.setMb(get_Membership());
        
    }
    
    protected abstract void record_Membership(Customer_Account ca);
    
    protected abstract Membership get_Membership();
    
}
