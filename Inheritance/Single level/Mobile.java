public class Mobile extends Device{
    String operatingSystem;
    int camera;
    
    Mobile(String brand,int screenSize String operatingSystem, int camera){

        //Super keyword calls the constructor of Parent class
      super(brand, screenSize);
      this,operatingSystem;
      this.camera = camera;
    
    }


    //Methods of parent class are bieng Override 
    @Override
    public void turnOn(){      
    System.out.println("Turning ONN........");
    }
    
    @Override
    public void turnOf(){
        System.out.println("Mobile is Turning OFF.......");
    }
    
    

}
