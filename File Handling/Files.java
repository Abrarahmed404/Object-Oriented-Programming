import java.io.*;

  public class Files{

      public static void main(String[] arg) throws IOException{
        
        File f = new File("/home/abrar-ahmed/Desktop/nmn.txt");
        
        if(f.createNewFile()){
            System.out.println("File is created,");
        } 
        else{
            System.out.println("File Already Exists");
        }
        
        
      
      


      }
      
    }




