public class Calculator{

	    private double result;
	
	    public Calculator(){
	      System.out.println("Default constructor");
	      result=0.0;
	    }
	
	    public Calculator(double result){
	      System.out.println("Parameterized constructor");
	      this.result = result;
	    }
	    
	    public void resetResult(){
	     result=0.0;
	    }
	    
	    public double getResult(){
        
        return result;
      }
	    
	    
	    //taking two int parameters
	    public int add(int a,int b){
	      System.out.println("method 1");
	      result =result + (a+b);
	      return (int)result;
	    }
	    
	    
	    //taking two parameters int and double
	    public double add(int a, double b){
	      System.out.println("method 2");
	      result =result + (a+b);
	     return result;
	    }
	    
	    
	    //taking two parameters int and double in different order
	    public double add(double a, int b){
	      System.out.println("method 3");
	      result =result + (a+b);
	      return result;
	    }
	    
	    
	    //taking three inputs
	    public int add(int a, int b, int c){
	      System.out.println("method 4");
	      result =result + (a+b);
	      return (int)result;
	    }


	 //taking two inputs as int
	    public int multiply(int a, int b){
	       System.out.println("Multiply method 1");
	       result =result + (a * b);
	       return (int)result;
	    }
	    
	    //taking two  inputs as double
	    public double multiply(double a, double b){
	      System.out.println("Multiply method 2");
	      result =result + (a*b);
	      return result;
	    }

		//Object as parameter
		public boolean compareCalculator(Calculator other){
     	   	if(this.result > other.result)
     	   	 return true;
        	else
        	 return false;
    	}

		//add result of two calculators and return a new object
		public Calculator addResult(Calculator other){
         	double newResult= result + other.result;
         	return new Calculator(newResult);
  	    }
	
	    
}	    
