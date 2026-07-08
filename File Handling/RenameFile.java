  import java.io.File;
  
  public class RenameFile{
    public static void main(String[] args){
    
    File f1 = new File("/home/abrar-ahmed/Desktop/mslm.txt");
    File f2 = new File("/home/abrar-ahmed/Desktop/Qadir.txt");
    
    if(f1.exists()){
      System.out.println("File Name: " + f1.getName());
      
      f1.renameTo(f2);   //here name of f1 file will be replaced by f2 file
    }
    else{
      System.out.println("File not found");
    }

    }
  }
