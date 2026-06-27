public class Dog extends Animal{
    String name;
    String color;
    String bread;


    //Parametarized Constructor
    Dog(String name, String color, String bread,int legs, double hieght,boolean hasTail){
    super(legs, hieght, hasTail);
    
    this.name = name;
    this.color = color;
    this.bread = bread;
    
    }


    //Default Constructor
     Dog(){
    }
    
    @Override          //This is the anotation it tells you if methode is bieng override or not (Optional)
    public void eat(){
    System.out.println("eating bone...");
    }
    
    
    
    
}
