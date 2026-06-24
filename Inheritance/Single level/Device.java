public class Device{
    String Brand;
    boolean powerStatus;
    int screenSize;
    
    
    Device(String brand,int ScreenSize){
    this.brand = brand;
    this.screenSide = screenSide;
    }
    
    
    public void turnOn(){
    powerStatus = true;
    
    }
    
     public void turnOf(){
    powerStatus = false;
    System.out.println("Turning OFF........");
    
    }
    
}    
