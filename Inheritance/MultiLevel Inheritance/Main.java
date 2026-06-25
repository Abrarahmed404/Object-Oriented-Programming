public class Main{
    public static void main(String[] args){
    
    //Grand parent class object
    Person p1 = new Person("Kashif","Manthar",21,"Sindh,Shikarpur,Wazirabad");
    p1.displayInfo();
    
    //Child of grand Parent class object
    Employ e1 = new Employ("Abrar","Mujeeb",19, "sindh,district shikarpur,Taluka Lakhi, UC Wazirabad","unarabrar80@gmail.com",83000,22108);
    e1.displayInfo();
    
    //Lowest child class object which has properties of both classes
    Professor pf1 = new Professor("Fahad","Mushtaque",19,"sindh,district shikarpur,Taluka Lakhi, UC Wazirabad","fahd879@gmail.com",65000,22110,"Cyber Security",9);
    pf1.displayInfo();
    
    }
}
