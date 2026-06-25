public class Employ extends Person{
    String email;
    double sallery;
    int employ_id;
    
    Employ(String name, String fname, int age, String adress, String email,double sallery, int id){
    super(name,fname,age,adress);
    
    this.email = email;
    this.sallery = sallery;
    employ_id = id;
    }
    
    
    @Override
     public void displayInfo(){
      System.out.println("Name: " + name + "\nFname: " + fname + "\nAge: " + age + "\nAdress: " + adress);
      
      System.out.println("Email: " + email + "\nSallery: " + sallery + "\nEmploy ID: " + employ_id);
    }
    

}
