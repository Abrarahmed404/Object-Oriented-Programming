public class Person{
    String name;
    String fname;
    int age;
    String adress;
    
    
    
    Person(String name, String fname, int age, String adress){
      this.name = name;
      this.fname = fname;
      this.age = age;
      this.adress = adress;    
    }
    
    public void displayInfo(){
      System.out.println("Name: " + name + "\nFname: " + fname + "\nAge: " + age + "\nAdress: " + adress);
    }
    
    
    

}
