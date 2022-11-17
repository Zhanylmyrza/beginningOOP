import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 5);
    
    System.out.println("Name: "+person.getName()+"\n"+"Nationality: "+person.getNationality()+"\n"+"Data of Birth: "+person.getDateOfBirth()+"\n"+"Seat Number: "+person.chooseSeat()+"\n\n");
    
    if(person.applyPassport()){
      System.out.println("Congratulations " + person.getName() + ". Your passport was approved!");
    }else{
      System.out.println("We are sorry " + person.getName() + ". We cannot process your application.");

    }

    

    // Person rayan = new Person("Rayan Slim","Rimyan","01/01/1111",5);
    
    // Person jad = new Person(rayan);
    // jad.setSeatNumber(3);
    
    
    // System.out.println("Name: "+rayan.getName()+"\n"+"Nationality: "+rayan.getNationality()+"\n"+"Data of Birth: "+rayan.getDateOfBirth()+"\n"+"Seat Number: "+rayan.getSeatNumber()+"\n\n");
    
    // System.out.println("Name: "+jad.getName()+"\n"+"Nationality: "+jad.getNationality()+"\n"+"Data of Birth: "+jad.getDateOfBirth()+"\n"+"Seat Number: "+jad.getSeatNumber()+"\n");
    
    
   
    

  }
}
