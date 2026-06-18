  public class Singleton{
  
    String name;
    
    private static Singleton instance;
    
    private Singleton(String name){
      this.name=name;
    }
    
    
    public static Singleton getInstance(String name){
      if(instance == null){
        instance = new Singleton(name);
        }
        
        return instance;
    }     
      

  }
