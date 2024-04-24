public class Admin extends User {

    // developed by Alireza Sobhdoost
    
    Expertise expertise ; 
    private int UserNumber = 2000 ;

    public Admin (String firstName, String lastName, String password , Expertise expertise) {
        super(firstName, lastName, password);
        this.expertise = expertise ;
        this.UserNumber = UserNumber + User.generateUserNumber();
    }


    @Override
    public String toString() {
        return "Admin{" +
                "firstName='" + this.firstName + '\'' +
                ", lastName='" + this.lastName + '\'' +
                ", password='" + getPassword() + '\'' +
                ", expertise=" + this.expertise + '\'' +
                ", usernumber=" + this.UserNumber+
                '}';
    }
    
}
