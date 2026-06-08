public class Car {

    String name;
    String model;
    int year;
    String Engine;

    //A constructor which will initialize the properties of objects
    Car(String name, String model,int year,String Engine){

        //this keyword will diffrentiate b/w instance variables(having this key word) and parameter variables.
        this.name=name;
        this.model=model;  
        this.year=year;
        this.Engine=Engine;
    }

    Car(){
        
    }

    //The car will start if you insert key (parameterized Method)
    public void start(int key){
        if (key==1) {
            System.out.println("Engine Started....");
        }
        else
            System.out.println("Not started!");
    }

    public void carInfo(){

        //Here this keyword points to the current object
        System.out.println(" Name = "+this.name + "\n Model = " + this.model 
        + "\n year = " + this.year + "\n Engine = "+this.Engine); 
    }


}
