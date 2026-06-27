public class Overriding{

  public static void main(String [] args){
  
  Dog d1 = new Dog("Tommy", "Brown", "Australian",4,3.6,true);  //Both Constructors work accorsing to diffrent inputs 
  Dog d2 = new Dog();                                                    //Its called constructor Overloading 
  
    System.out.println("Dog object: " + d1.name + " " + d1.color + " " + d1.hieght);
    System.out.println("Dog object: " + d2.name + " " + d2.color + " " + d2.hieght);



  Cow c1 = new Cow("White","Sindhi",4, 5.8, true);
 
    System.out.println("Cow object: " + c1.color + " " + c1.hieght);
  
  
  //here both objects are using the same function but here it is not same according to objects
  //both classes override eat method and modify it accordingly 
  //same method but  different output    
    d1.eat();
    c1.eat();
  }

}
