import java.io.*; 
 
 public class ReadFile{
    public static void main(){
      try{
        FileReader f = new FileReader("/home/abrar-ahmed/Desktop/nmn.txt");
        try{
        int i;
          while((i = f.read())!=-1){   //here f.read will return ASCI value of Characters
            System.out.print((char)i);  //here ASCI value will be changed into characters again
          }
        }
        //finally block will run weather we get ecxeption or not while reading the file
        finally{
          f.close();
        }
      }
      //if we get exception while creating/selecting the file then it will be catch here
      catch(IOException i){
        System.out.println("Exception is: " + i);
      }
    
    
    }
  }
