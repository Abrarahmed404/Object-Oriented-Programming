import java.io.File;

  public class FilesInfo{
    public static void main(String [] args){
    
        File f = new File("/home/abrar-ahmed/Desktop/nmn.txt");
        
        if (f.exists()){
          System.out.println("File Name: " + f.getName());
          System.out.println("File Location: " + f.getAbsolutePath());
          System.out.println("File length: " + f.length());
          System.out.println("File Readable: " + f.canWrite());
          System.out.println("File Writeable: " + f.canWrite());
        }
        else{
          System.out.println("File does not Exists...!");        
        }
    
  
    }  
  }
