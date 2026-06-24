public class Mobile extends Device{
    String operatingSystem;
    int camera;
    
    Mobile(String brand,int screenSize String operatingSystem, int camera){
      super(brand, screenSize);
      this,operatingSystem;
      this.camera = camera;
    
    }
    
    
    public void turnOn(){      
    System.out.println("Turning ONN........");
    }
    
    public void turnOff(){
        System.out.println("Mobile is Turning OFF.......");
    }
    
    

}
