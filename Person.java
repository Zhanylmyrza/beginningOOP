import java.lang.reflect.WildcardType;

public class Person {
//___________________________________________________________________fields
  
  private String name;
  private String nationality;
  private String dateOfBirth;
  private String[] passport;
  private int seatNumber;
//___________________________________________________________________constructor
  
  public Person(String name,String nationality,String dateOfBirth,int seatNumber){
    this.name = name;
    this.nationality=nationality;
    this.dateOfBirth=dateOfBirth;
    this.passport=passport;
    this.seatNumber=seatNumber;
  }
  
//___________________________________________________________________getters
  
  public String getName(){
    return this.name;
  }
  public String getNationality(){
    return this.nationality;
  }
  public String getDateOfBirth(){
    return this.dateOfBirth;
  }
  public String[] getPassport(){
    return this.passport;
  }
  public int getSeatNumber(){
    return this.seatNumber;
  }
  
//___________________________________________________________________setters
  
  public void setName(String namee){
    this.name=namee;
  }
  public void setNationality(String Nationality){
    this.nationality=Nationality;
  }
  public void setDateOfBirth(String DateOfBirth){
    this.dateOfBirth=DateOfBirth;
  }
  public void setPassport(String[] Passport){
    this.passport=Passport;
  }
  public void setSeatNumber(int SeatNumber){
    this.seatNumber=SeatNumber;
  }
 //___________________________________________________________________toCopy
 
  public Person(Person source){
    this.name=source.name;
    this.nationality=source.nationality;   
    this.dateOfBirth=source.dateOfBirth;
    this.seatNumber=source.seatNumber;
  }
 //___________________________________________________________________functions
  
  public  boolean applyPassport(){
    int number = (int) (Math.random() * 2);
    while(number==1){
      return true;
    }
    return false;
  }
  public  int chooseSeat(){
    int randNum = (int) (Math.random() * 11 + 1); 
    return randNum;
  }
}
// String[] passport, was in constructor like parameter