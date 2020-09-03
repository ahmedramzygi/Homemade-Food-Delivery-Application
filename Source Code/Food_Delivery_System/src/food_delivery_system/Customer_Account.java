package food_delivery_system;

public class Customer_Account {

    private final int customer_id;
    private String username;
    private String password;
    private String email;
    private Membership mb;
    private Payment_Method pm;
    

    public Customer_Account(int customer_id, String username, String password, String email) {
        this.customer_id = customer_id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMb(Membership mb) {
        this.mb = mb;
    }

    public void setPm(Payment_Method pm) {
        this.pm = pm;
    }
    
    public String getUsername() {
        return username;
    }

    public int getCustpmer_id() {
        return customer_id;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public Membership getMb() {
        return mb;
    }

    public Payment_Method getPm() {
        return pm;
    }
    
    public String view_mb() {
        if (mb instanceof Golden_Membership)
            return "--->>> Congratulations ... You are a gold member";
        else
            return "--->>> You're not a gold member";
    }
    
    public String view_pm() {
        if (pm instanceof Cash_Payment)
            return "--->>> You pay with cash on delivery";
        else
            return "--->>>You pay with visa";
    }
    
    
    
}