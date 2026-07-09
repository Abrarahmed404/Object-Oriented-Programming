import java.io.*;

  public class CopyFile{
    public static void main(String [] args) throws IOException{

      //FileInputStream is predefined class used to read a File
         FileInputStream fis = new FileInputStream("/home/abrar-ahmed/Desktop/Qadir.txt"); 

      //FileutputStream is predefined class used to create and Write in a File
         FileOutputStream fos = new FileOutputStream("/home/abrar-ahmed/Desktop/Abrar.txt");

      
           int i;      
           while((i = fis.read())!=-1){   // here i will store the ASCI value of Char
        
            fos.write((char)i);    //Here ASCI Value of char will be changed to characte and will be written in second file 
      }
            fis.close();
        
        
        
    }
  }
