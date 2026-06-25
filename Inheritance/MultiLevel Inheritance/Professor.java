public class Professor extends Employ{
    String sub_specialization;
    int office_hours;
    
    
    Professor(String name, String fname, int age, String adress, String email,double sallery, int id, String sub_specialization, int office_hours){
    
    super(name,fname,age,adress,email,sallery,id);
    
    this.sub_specialization = sub_specialization;
    this.office_hours = office_hours;
    
    }
    
    
    
     @Override
     public void displayInfo(){
      System.out.println("Name: " + name + "\nFname: " + fname + "\nAge: " + age + "\nAdress: " + adress);
      
      System.out.println("Email: " + email + "\nSallery: " + sallery + "\nEmploy ID: " + employ_id);
      
      System.out.println("Subject specialization: " + sub_specialization + "\nOffice Hours: " + office_hours);
    }


}
