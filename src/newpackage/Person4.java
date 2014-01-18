package newpackage;

public class Person4 {
  public String firstName;
  public String lastName;
  
  public Person4(){
  }
  
    public Person4(String firstName){
        this.firstName=firstName;
    }
    
    public Person4(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    
  public String getFullName() {
    return(firstName + " " + lastName);
  }
}
