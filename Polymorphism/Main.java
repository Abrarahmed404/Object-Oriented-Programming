public class Main{

    public static void main(String[] args){
    
    Calculator c1 = new Calculator(); //Default Constructor is used 
    Calculator c2 = new Calculator(4.3); //Parameterized constructor is used
    
    
    System.out.println(c1.add(4,7)); //Method 1
     
    System.out.println(c1.add(2,3,7)); //Method 4
    
   System.out.println( c1.add(3.2,5)); //Method 3
    
   System.out.println( c1.add(2,2.8));//Method 2
   
   System.out.println("Current Result = " + c1.getResult());
   
   c1.resetResult();
    
   System.out.println("Current Result = " + c1.getResult()); 
    
    
    }
}
