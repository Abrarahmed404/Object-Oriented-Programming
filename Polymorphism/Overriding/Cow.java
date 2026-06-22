public class Cow extends Animal{
      String color;
      String bread;
    
    Cow(String color, String bread, int legs, double hieght, boolean hasTail){
      super(legs,hieght,hasTail);
      
      this.color = color;
      this.bread = bread;
    }
    
    @Override
    public void eat(){
      System.out.println("eating grass...");
    }  
    
}
