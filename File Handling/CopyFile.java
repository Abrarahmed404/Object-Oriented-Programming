import java.io.*;

  public class CopyFile{
    public static void main(String [] args) throws IOException{
         FileInputStream fis = new FileInputStream("/home/abrar-ahmed/Desktop/Qadir.txt"); 
         FileOutputStream fos = new FileOutputStream("/home/abrar-ahmed/Desktop/Abrar.txt");
           int i;
      
           while((i = fis.read())!=-1){   // here i will store the ASCI value of Char
        
            fos.write((char)i);    //Here ASCI Value of char will be changed to characte and will be written in second file 
      }
            fis.close();
        
        
        
    }
  }
