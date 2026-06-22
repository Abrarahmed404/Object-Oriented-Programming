public class Dog extends Animal{
    String name;
    String color;
    String bread;

    Dog(String name, String color, String bread,int legs, double hieght,boolean hasTail){
    super(legs, hieght, hasTail);
    
    this.name = name;
    this.color = color;
    this.bread = bread;
    
    }
    
    @Override
    public void eat(){
    System.out.println("eating bone...");
    }
    
    
    
    
}
