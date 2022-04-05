package LAB27;

public class Customer {
    private String firstname;
    private String lastname;
    private String id;
    Customer()
    {

    }
    Customer(String firstname,String lastname,String id)
    {
        this.firstname = firstname;
        this.lastname=lastname;
        this.id= id;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
    public String getId() {
        return id;
    }

    public void ShowCustomer() {
        System.out.println("First Name:\t"+getFirstname());
        System.out.println("Last Name:\t"+getLastname());
        System.out.println("ID:\t"+getId());
    }

}
