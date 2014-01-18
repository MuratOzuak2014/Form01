package newpackage;

import java.util.ArrayList;
//import java.util.List;

public class Person4Test {
  public static void main(String[] args) {
    //Person4[] people = new Person4[20];
    ArrayList<Person4> people=new ArrayList<Person4>();  
    //for(int i=0; i<people.length; i++) {
    for(int i=0; i<1000; i++) {
      //people[i] = new Person4(NameUtils.randomFirstName(),NameUtils.randomLastName());
        ////Person4 person=new Person4(NameUtils.randomFirstName(),NameUtils.randomLastName());
        Person4 person=new Person4();
        person.firstName=NameUtils.randomFirstName();
        person.lastName=NameUtils.randomLastName();
        people.add(person);
    }
    for(Person4 person: people) {
      System.out.println("Person's full name: " + person.getFullName());
    }
    
    System.out.println(Math.PI);
  }
}
