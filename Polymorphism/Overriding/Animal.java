public class Animal{
    int legs;
    boolean hasTail;
    double hieght;
   
   
   public void eat(){
   System.out.print("eating");
   }
   


    //Parametarized Constructor
    Animal(int legs, double hieght, boolean hasTail){
    
    this.legs = legs;
    this.hasTail = hasTail;
    this.hieght = hieght;
    
    }



    //Non parametarized Constructor
    Animal(){

    }
    
    
}
