public class Overriding{

  public static void main(String [] args){
  
  Dog d1 = new Dog("Tommy", "Brown", "Australian",4,3.6,true);
  
  System.out.println("Dog object: " + d1.name + " " + d1.color + " " + d1.hieght);
  
  Cow c1 = new Cow("White","Sindhi",4, 5.8, true);
 
  System.out.println("Cow object: " + c1.color + " " + c1.hieght);
  
  
  //here both objects are using the same function but here it is not same according to objhects
  //both classes override eat method and modify it accordingly 
  //same method but  different outtput
  d1.eat();
  c1.eat();
  }

}
