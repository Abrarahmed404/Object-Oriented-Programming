public class Inheritance{

  public static void main(String[] Args){
  
  Device d1 = new Device("unknown",23); // obj of parent class
  
  
  Mobile m1 = new Mobile("Redmi C15",12,"Android",3); //obj of child class
  
  
   //parents reffering to child  (Allowed)
    Device d2 = new Mobile("Redmi c14",10,"Android",2);
    
    //Child reffering to Parent (Not Allowed)
    //Mobile m1 = new Device("Redmi C15",12,"Android",3);
      }
  }
